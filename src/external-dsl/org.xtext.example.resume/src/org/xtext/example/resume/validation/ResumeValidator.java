package org.xtext.example.resume.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.resume.resume.Customization;
import org.xtext.example.resume.resume.ResumePackage;
import java.io.File;

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
}