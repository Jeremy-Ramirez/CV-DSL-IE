package org.xtext.example.resume.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.resume.resume.Profile
import org.xtext.example.resume.resume.Experience
import org.xtext.example.resume.resume.Projects
import org.xtext.example.resume.resume.Education
import org.xtext.example.resume.resume.Job
import org.xtext.example.resume.resume.Project
import org.xtext.example.resume.resume.Degree
import java.nio.file.Files
import java.nio.file.Paths
import java.util.regex.Pattern
import java.util.List
import java.util.ArrayList

class ResumeGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val profile = resource.contents.head as Profile
		if (profile === null || profile.customization === null || profile.customization.jobOfferPath === null) return

		val jsonPath = profile.customization.jobOfferPath.replace("\"", "").trim()
		val file = new java.io.File(jsonPath)
		if (!file.exists() || file.isDirectory()) return

		val requiredTags = getRequiredTagsFromJson(jsonPath)
		
		// Listas para el CV Dinámico
		val matchedJobs = new ArrayList<Job>()
		val omittedJobs = new ArrayList<Job>()
		val matchedProjects = new ArrayList<Project>()
		val omittedProjects = new ArrayList<Project>()
		val matchedEducation = new ArrayList<Degree>()

		// RECORRIDO DEL AST PARA FILTRADO
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
						// La educación suele ser general, pero si tiene tags, los filtramos
						if (matchesTags(degree.tags.values, requiredTags)) matchedEducation.add(degree)
					}
				}
			}
		}

		fsa.generateFile("Dashboard_CV.html", generateHTML(profile, requiredTags, matchedJobs, omittedJobs, matchedProjects, omittedProjects, matchedEducation))
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

	def CharSequence generateHTML(Profile profile, List<String> requiredTags, List<Job> mJobs, List<Job> oJobs, List<Project> mProj, List<Project> oProj, List<Degree> mEdu) '''
		<!DOCTYPE html>
		<html>
		<head>
			<meta charset="UTF-8">
			<style>
				body { font-family: sans-serif; line-height: 1.6; color: #333; max-width: 900px; margin: auto; background: #f0f2f5; padding: 20px; }
				.card { background: white; padding: 25px; border-radius: 12px; shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; border: 1px solid #e1e4e8; }
				.dashboard { border-left: 8px solid #f1c40f; background: #fef9e7; }
				.cv-header { text-align: center; border-bottom: 3px solid #3498db; padding-bottom: 10px; }
				h2 { color: #2c3e50; border-bottom: 1px solid #eee; }
				.tag-box { display: inline-block; background: #e8f4fd; color: #2980b9; padding: 2px 8px; border-radius: 4px; font-size: 12px; margin-right: 5px; }
				.omitted-item { color: #c0392b; font-size: 0.9em; margin-bottom: 5px; }
			</style>
		</head>
		<body>
			<div class="card dashboard">
				<h2>🔍 Análisis de Relevancia (Feedback)</h2>
				<p><b>Criterio Externo:</b> «String.join(", ", requiredTags)»</p>
				
				<h4>Elementos descartados por falta de match:</h4>
				<ul>
					«FOR j : oJobs»<li class="omitted-item">Experiencia: «j.title.replace("\"", "")»</li>«ENDFOR»
					«FOR p : oProj»<li class="omitted-item">Proyecto: «p.title.replace("\"", "")»</li>«ENDFOR»
				</ul>
			</div>

			<div class="card">
				<div class="cv-header">
					<h1>«profile.userdata.name.replace("\"", "")»</h1>
					<p>«profile.userdata.email.replace("\"", "")» | «profile.userdata.telephoneNumber.replace("\"", "")»</p>
				</div>

				<h2>🚀 Proyectos Seleccionados</h2>
				«FOR p : mProj»
					<div>
						<b>«p.title.replace("\"", "")»</b> - <a href="#">«p.link.replace("\"", "")»</a>
						<p>«String.join(", ", p.description.values)»</p>
						<div>«FOR t : p.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
					</div>
				«ENDFOR»

				<h2>💼 Experiencia Profesional Relevante</h2>
				«FOR j : mJobs»
					<div style="margin-bottom: 15px;">
						<b>«j.title.replace("\"", "")»</b> en <i>«j.company.replace("\"", "")»</i>
						<br><small>«j.startDate.replace("\"", "")» - «j.endDate.replace("\"", "")»</small>
						<div>«FOR t : j.tags.values»<span class="tag-box">«t»</span>«ENDFOR»</div>
					</div>
				«ENDFOR»

				<h2>🎓 Educación Relacionada</h2>
				«FOR e : mEdu»
					<p><b>«e.title.replace("\"", "")»</b> - «e.institution.replace("\"", "")» («e.graduationDate.replace("\"", "")»)</p>
				«ENDFOR»
			</div>
		</body>
		</html>
	'''
}