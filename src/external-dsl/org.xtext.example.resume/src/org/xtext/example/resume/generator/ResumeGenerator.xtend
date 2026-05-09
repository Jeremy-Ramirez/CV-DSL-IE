package org.xtext.example.resume.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.resume.resume.Profile
import org.xtext.example.resume.resume.Experience
import org.xtext.example.resume.resume.Projects
import org.xtext.example.resume.resume.Education
import org.xtext.example.resume.resume.Skills
import org.xtext.example.resume.resume.Job
import org.xtext.example.resume.resume.Project
import org.xtext.example.resume.resume.Degree
import java.nio.file.Files
import java.nio.file.Paths
import java.util.regex.Pattern
import java.util.List
import java.util.ArrayList
import java.util.HashSet

class ResumeGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val profile = resource.contents.head as Profile
		if (profile === null || profile.customization === null || profile.customization.jobOfferPath === null) return

		val jsonPath = profile.customization.jobOfferPath.replace("\"", "").trim()
		val file = new java.io.File(jsonPath)
		if (!file.exists() || file.isDirectory()) return

		val requiredTags = getRequiredTagsFromJson(jsonPath)
		
		// 1. Capturamos el idioma objetivo
		var targetLang = "es"
		if (profile.customization.language !== null) {
			targetLang = profile.customization.language.replace("\"", "").trim().toLowerCase()
		}

		val matchedJobs = new ArrayList<Job>()
		val omittedJobs = new ArrayList<Job>()
		val matchedProjects = new ArrayList<Project>()
		val omittedProjects = new ArrayList<Project>()
		val allEducation = new ArrayList<Degree>()

		// 2. FILTRADO DOBLE (Primero por Idioma, luego por Tags)
		for (section : profile.sections) {
			switch (section) {
				Experience: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						for (job : section.jobs) {
							if (matchesTags(job.tags.values, requiredTags)) matchedJobs.add(job) 
							else omittedJobs.add(job)
						}
					}
				}
				Projects: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						for (proj : section.projects) {
							if (matchesTags(proj.tags.values, requiredTags)) matchedProjects.add(proj) 
							else omittedProjects.add(proj)
						}
					}
				}
				Education: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						allEducation.addAll(section.degrees)
					}
				}
			}
		}

		// 3. Calculamos porcentaje usando solo los tags del idioma objetivo
		val matchPercentage = calculateMatchPercentage(profile, requiredTags, targetLang)

		fsa.generateFile("Dashboard_CV.html", generateHTML(profile, requiredTags, matchPercentage, matchedJobs, omittedJobs, matchedProjects, omittedProjects, allEducation, targetLang))
	}

	def int calculateMatchPercentage(Profile profile, List<String> requiredTags, String targetLang) {
		if (requiredTags.empty) return 100
		val userTags = new HashSet<String>()
		
		for (section : profile.sections) {
			switch (section) {
				Experience: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						section.jobs.forEach[j | j.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
					}
				}
				Projects: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						section.projects.forEach[p | p.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
					}
				}
				Skills: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						section.skills.forEach[s | s.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
					}
				}
				Education: {
					if (section.language !== null && section.language.replace("\"", "").trim().toLowerCase() == targetLang) {
						section.degrees.forEach[d | d.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
					}
				}
			}
		}
		
		var matchCount = 0
		for (reqTag : requiredTags) {
			if (userTags.contains(reqTag)) matchCount++
		}
		return (matchCount * 100) / requiredTags.size
	}

	def List<String> getRequiredTagsFromJson(String path) {
		val tags = new ArrayList<String>()
		try {
			val content = new String(Files.readAllBytes(Paths.get(path)))
			val matcher = Pattern.compile("\"requiredTags\"\\s*:\\s*\\[(.*?)\\]").matcher(content)
			if (matcher.find()) {
				val rawTags = matcher.group(1).split(",")
				for (tag : rawTags) tags.add(tag.replace("\"", "").trim().toLowerCase())
			}
		} catch (Exception e) {}
		return tags
	}

	def boolean matchesTags(List<String> elementTags, List<String> requiredTags) {
		if (elementTags === null || elementTags.empty) return false
		for (tag : elementTags) {
			if (requiredTags.contains(tag.replace("\"", "").trim().toLowerCase())) return true
		}
		return false
	}

	def CharSequence generateHTML(Profile profile, List<String> requiredTags, int matchPercentage, List<Job> mJobs, List<Job> oJobs, List<Project> mProj, List<Project> oProj, List<Degree> allEdu, String lang) '''
		<!DOCTYPE html>
		<html lang="«lang»">
		<head>
			<meta charset="UTF-8">
			<style>
				body { font-family: sans-serif; line-height: 1.6; color: #333; max-width: 900px; margin: auto; background: #f0f2f5; padding: 20px; }
				.card { background: white; padding: 25px; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; border: 1px solid #e1e4e8; }
				.dashboard { border-left: 8px solid «IF matchPercentage >= 80»#2ecc71«ELSEIF matchPercentage >= 50»#f39c12«ELSE»#e74c3c«ENDIF»; background: #fef9e7; }
				.cv-header { text-align: center; border-bottom: 3px solid #3498db; padding-bottom: 10px; }
				h2 { color: #2c3e50; border-bottom: 2px solid #eee; padding-bottom: 5px; }
				.tag-box { display: inline-block; background: #e8f4fd; color: #2980b9; padding: 2px 8px; border-radius: 4px; font-size: 12px; margin-right: 5px; margin-top: 5px;}
				.omitted-item { color: #c0392b; font-size: 0.9em; margin-bottom: 5px; }
				.progress-container { width: 100%; background-color: #ddd; border-radius: 8px; margin: 15px 0; overflow: hidden; }
				.progress-bar { height: 24px; text-align: center; color: white; font-weight: bold; line-height: 24px;
					background-color: «IF matchPercentage >= 80»#2ecc71«ELSEIF matchPercentage >= 50»#f39c12«ELSE»#e74c3c«ENDIF»; 
					width: «matchPercentage»%; 
				}
				.edu-item { margin-bottom: 10px; padding-left: 10px; border-left: 3px solid #95a5a6; }
			</style>
		</head>
		<body>
			<div class="card dashboard">
				<h2>«IF lang == 'en'»📊 Analysis Dashboard«ELSE»📊 Dashboard de Análisis«ENDIF»</h2>
				<p><b>«IF lang == 'en'»Target Offer:«ELSE»Oferta Objetivo:«ENDIF»</b> «profile.customization.jobOfferPath.replace("\"", "")»</p>
				<p><b>«IF lang == 'en'»Required Tags:«ELSE»Tags Requeridos:«ENDIF»</b> «String.join(", ", requiredTags)»</p>
				
				<h3>Match Score: «matchPercentage»%</h3>
				<div class="progress-container">
					<div class="progress-bar">«IF matchPercentage > 10»«matchPercentage»%«ENDIF»</div>
				</div>
				
				<h4>«IF lang == 'en'»Elements omitted from the final CV:«ELSE»Elementos omitidos en el CV final:«ENDIF»</h4>
				<ul>
					«IF oJobs.empty && oProj.empty»
						<li style="color: green;">«IF lang == 'en'»Perfect! Your experience and projects are a 100% match.«ELSE»¡Perfecto! Tu experiencia y proyectos encajan al 100%.«ENDIF»</li>
					«ELSE»
						«FOR j : oJobs»<li class="omitted-item">«IF lang == 'en'»Experience:«ELSE»Experiencia:«ENDIF» «j.title.replace("\"", "")»</li>«ENDFOR»
						«FOR p : oProj»<li class="omitted-item">«IF lang == 'en'»Project:«ELSE»Proyecto:«ENDIF» «p.title.replace("\"", "")»</li>«ENDFOR»
					«ENDIF»
				</ul>
			</div>

			<div class="card">
				<div class="cv-header">
					<h1>«profile.userdata.name.replace("\"", "")»</h1>
					<p>«profile.userdata.email.replace("\"", "")» | «profile.userdata.telephoneNumber.replace("\"", "")»</p>
					<p>«profile.userdata.direction.replace("\"", "")», «profile.userdata.city.replace("\"", "")», «profile.userdata.country.replace("\"", "")»</p>
				</div>

				«IF !allEdu.empty»
					<h2>«IF lang == 'en'»🎓 Academic Background«ELSE»🎓 Formación Académica«ENDIF»</h2>
					«FOR e : allEdu»
						<div class="edu-item">
							<b>«e.title.replace("\"", "")»</b><br>
							«e.institution.replace("\"", "")» | «e.graduationDate.replace("\"", "")»
						</div>
					«ENDFOR»
				«ENDIF»

				«IF !mProj.empty»
					<h2>«IF lang == 'en'»🚀 Selected Projects«ELSE»🚀 Proyectos Seleccionados«ENDIF»</h2>
					«FOR p : mProj»
						<div style="margin-bottom: 15px;">
							<b>«p.title.replace("\"", "")»</b> - <small>«p.link.replace("\"", "")»</small>
							<p style="margin: 5px 0;">«String.join(", ", p.description.values)»</p>
							<div>«FOR t : p.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
						</div>
					«ENDFOR»
				«ENDIF»

				«IF !mJobs.empty»
					<h2>«IF lang == 'en'»💼 Relevant Professional Experience«ELSE»💼 Experiencia Profesional Relevante«ENDIF»</h2>
					«FOR j : mJobs»
						<div style="margin-bottom: 20px;">
							<b>«j.title.replace("\"", "")»</b> | <i>«j.company.replace("\"", "")»</i>
							<br><small>«j.startDate.replace("\"", "")» - «j.endDate.replace("\"", "")»</small>
							<p style="margin: 5px 0;">«String.join(", ", j.description.values)»</p>
							<div>«FOR t : j.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
						</div>
					«ENDFOR»
				«ENDIF»
			</div>
		</body>
		</html>
	'''
}