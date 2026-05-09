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
		
		val matchedJobs = new ArrayList<Job>()
		val omittedJobs = new ArrayList<Job>()
		val matchedProjects = new ArrayList<Project>()
		val omittedProjects = new ArrayList<Project>()
		val matchedEducation = new ArrayList<Degree>()

		for (section : profile.sections) {
			switch (section) {
				Experience: {
					for (job : section.jobs) {
						if (matchesTags(job.tags.values, requiredTags)) matchedJobs.add(job) 
						else omittedJobs.add(job)
					}
				}
				Projects: {
					for (proj : section.projects) {
						if (matchesTags(proj.tags.values, requiredTags)) matchedProjects.add(proj) 
						else omittedProjects.add(proj)
					}
				}
				Education: {
					for (degree : section.degrees) {
						if (matchesTags(degree.tags.values, requiredTags)) matchedEducation.add(degree)
					}
				}
			}
		}

		// CALCULAR EL PORCENTAJE DE MATCH
		val matchPercentage = calculateMatchPercentage(profile, requiredTags)

		fsa.generateFile("Dashboard_CV.html", generateHTML(profile, requiredTags, matchPercentage, matchedJobs, omittedJobs, matchedProjects, omittedProjects, matchedEducation))
	}

	def int calculateMatchPercentage(Profile profile, List<String> requiredTags) {
		if (requiredTags.empty) return 100
		
		// Usamos un HashSet para recolectar los tags del usuario sin duplicados
		val userTags = new HashSet<String>()
		
		for (section : profile.sections) {
			switch (section) {
				Experience: section.jobs.forEach[j | j.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
				Projects: section.projects.forEach[p | p.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
				Skills: section.skills.forEach[s | s.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
				Education: section.degrees.forEach[d | d.tags.values.forEach[t | userTags.add(t.replace("\"", "").trim().toLowerCase())]]
			}
		}

		// Contar cuántos de los requiredTags están en los userTags
		var matchCount = 0
		for (reqTag : requiredTags) {
			if (userTags.contains(reqTag)) {
				matchCount++
			}
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

	def CharSequence generateHTML(Profile profile, List<String> requiredTags, int matchPercentage, List<Job> mJobs, List<Job> oJobs, List<Project> mProj, List<Project> oProj, List<Degree> mEdu) '''
		<!DOCTYPE html>
		<html>
		<head>
			<meta charset="UTF-8">
			<style>
				body { font-family: sans-serif; line-height: 1.6; color: #333; max-width: 900px; margin: auto; background: #f0f2f5; padding: 20px; }
				.card { background: white; padding: 25px; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; border: 1px solid #e1e4e8; }
				.dashboard { border-left: 8px solid «IF matchPercentage >= 80»#2ecc71«ELSEIF matchPercentage >= 50»#f39c12«ELSE»#e74c3c«ENDIF»; background: #fef9e7; }
				.cv-header { text-align: center; border-bottom: 3px solid #3498db; padding-bottom: 10px; }
				h2 { color: #2c3e50; border-bottom: 1px solid #eee; }
				.tag-box { display: inline-block; background: #e8f4fd; color: #2980b9; padding: 2px 8px; border-radius: 4px; font-size: 12px; margin-right: 5px; margin-top: 5px;}
				.omitted-item { color: #c0392b; font-size: 0.9em; margin-bottom: 5px; }
				
				/* Estilos para la barra de progreso */
				.progress-container { width: 100%; background-color: #ddd; border-radius: 8px; margin: 15px 0; overflow: hidden; }
				.progress-bar { height: 24px; text-align: center; color: white; font-weight: bold; line-height: 24px;
					background-color: «IF matchPercentage >= 80»#2ecc71«ELSEIF matchPercentage >= 50»#f39c12«ELSE»#e74c3c«ENDIF»; 
					width: «matchPercentage»%; 
				}
			</style>
		</head>
		<body>
			<div class="card dashboard">
				<h2>📊 Análisis de Compatibilidad</h2>
				<p><b>Tags Requeridos:</b> «String.join(", ", requiredTags)»</p>
				
				<h3>Match Score: «matchPercentage»%</h3>
				<div class="progress-container">
					<div class="progress-bar">«IF matchPercentage > 10»«matchPercentage»%«ENDIF»</div>
				</div>
				
				<h4>Elementos descartados por falta de match:</h4>
				<ul>
					«IF oJobs.empty && oProj.empty»
						<li style="color: green;">¡Excelente! Todo tu historial hace match con esta oferta.</li>
					«ELSE»
						«FOR j : oJobs»<li class="omitted-item">Experiencia: «j.title.replace("\"", "")»</li>«ENDFOR»
						«FOR p : oProj»<li class="omitted-item">Proyecto: «p.title.replace("\"", "")»</li>«ENDFOR»
					«ENDIF»
				</ul>
			</div>

			<div class="card">
				<div class="cv-header">
					<h1>«profile.userdata.name.replace("\"", "")»</h1>
					<p>«profile.userdata.email.replace("\"", "")» | «profile.userdata.telephoneNumber.replace("\"", "")»</p>
				</div>

				«IF !mProj.empty»
					<h2>🚀 Proyectos Seleccionados</h2>
					«FOR p : mProj»
						<div>
							<b>«p.title.replace("\"", "")»</b> - <a href="#">«p.link.replace("\"", "")»</a>
							<p>«String.join(", ", p.description.values)»</p>
							<div>«FOR t : p.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
						</div>
					«ENDFOR»
				«ENDIF»

				«IF !mJobs.empty»
					<h2>💼 Experiencia Profesional Relevante</h2>
					«FOR j : mJobs»
						<div style="margin-bottom: 15px;">
							<b>«j.title.replace("\"", "")»</b> en <i>«j.company.replace("\"", "")»</i>
							<br><small>«j.startDate.replace("\"", "")» - «j.endDate.replace("\"", "")»</small>
							<div>«FOR t : j.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
						</div>
					«ENDFOR»
				«ENDIF»

				«IF !mEdu.empty»
					<h2>🎓 Educación Relacionada</h2>
					«FOR e : mEdu»
						<p><b>«e.title.replace("\"", "")»</b> - «e.institution.replace("\"", "")» («e.graduationDate.replace("\"", "")»)</p>
					«ENDFOR»
				«ENDIF»
			</div>
		</body>
		</html>
	'''
}