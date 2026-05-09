package org.xtext.example.resume.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.resume.resume.Customization;
import org.xtext.example.resume.resume.ResumePackage;
import java.io.File;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import org.xtext.example.resume.resume.Experience;
import org.xtext.example.resume.resume.Job;
import org.xtext.example.resume.resume.Profile;
import org.xtext.example.resume.resume.Section;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ResumeValidator extends AbstractResumeValidator {
	
    public static final String INVALID_PATH = "invalid_path";

    @Check
    public void checkJobOfferPathExists(Customization custom) {
        // Usamos getJobOfferPath() porque así se llama la variable en la gramática
        if (custom.getJobOfferPath() != null && !custom.getJobOfferPath().isEmpty()) {
            
            File file = new File(custom.getJobOfferPath());
            
            if (!file.exists() || file.isDirectory()) {
                error("Error: El archivo de oferta laboral no existe en la ruta especificada.",
                      ResumePackage.Literals.CUSTOMIZATION__JOB_OFFER_PATH,
                      INVALID_PATH);
            } 
            else if (!file.getName().endsWith(".json")) {
                warning("Advertencia: El archivo referenciado debería tener extensión .json",
                        ResumePackage.Literals.CUSTOMIZATION__JOB_OFFER_PATH);
            }
        }
    }
    
    
    @Check
    public void checkTemporalIncongruence(Customization custom) {
        if (custom.getJobOfferPath() == null || custom.getJobOfferPath().isEmpty()) return;

        File file = new File(custom.getJobOfferPath());
        if (!file.exists() || file.isDirectory() || !file.getName().endsWith(".json")) return;

        try {
            // 1. Leer el archivo JSON como String
            String jsonContent = new String(Files.readAllBytes(Paths.get(custom.getJobOfferPath())));

            // 2. Extraer los años requeridos usando Regex
            Pattern expPattern = Pattern.compile("\"requiredExperienceYears\"\\s*:\\s*(\\d+)");
            Matcher expMatcher = expPattern.matcher(jsonContent);
            int requiredYears = 0;
            if (expMatcher.find()) {
                requiredYears = Integer.parseInt(expMatcher.group(1));
            }

            // Si la oferta no requiere experiencia, no hay incongruencia
            if (requiredYears == 0) return;

            // 3. Obtener el Profile (la raíz del documento)
            Profile profile = (Profile) custom.eContainer();
            long totalMonthsExperience = 0;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // 4. Calcular el tiempo total trabajado en los empleos
            for (Section section : profile.getSections()) {
                if (section instanceof Experience) {
                    Experience expSection = (Experience) section;
                    for (Job job : expSection.getJobs()) {
                    	try {
                    	    // 1. Limpiamos posibles comillas o espacios invisibles que Xtext deje en el String
                    	    String cleanStartDate = job.getStartDate().replace("\"", "").trim();
                    	    String cleanEndDate = job.getEndDate().replace("\"", "").trim();

                    	    LocalDate start = LocalDate.parse(cleanStartDate, formatter);
                    	    LocalDate end = LocalDate.parse(cleanEndDate, formatter);
                    	    
                    	    // Calculamos meses
                    	    long months = ChronoUnit.MONTHS.between(start, end);
                    	    if (months > 0) {
                    	        totalMonthsExperience += months;
                    	    }
                    	} catch (Exception e) {
                    	    // Imprimimos en consola para ver exactamente por qué falla si vuelve a pasar
                    	    System.out.println("Error parseando fechas: " + job.getStartDate() + " al " + job.getEndDate());
                    	    e.printStackTrace();
                    	}
                    }
                }
            }

            // 5. Comparar y lanzar advertencia si no cumple
            double totalYearsCalculated = totalMonthsExperience / 12.0;
            
            if (totalYearsCalculated < requiredYears) {
                warning("Incongruencia Temporal: La oferta requiere " + requiredYears + 
                        " años de experiencia, pero en tu CV solo sumas " + 
                        String.format("%.1f", totalYearsCalculated) + " años. ¡Considera añadir más experiencia!",
                        ResumePackage.Literals.CUSTOMIZATION__JOB_OFFER_PATH);
            }

        } catch (IOException e) {
            // Error al leer el archivo, no hacemos nada (ya se maneja en el otro check)
        }
    }
}