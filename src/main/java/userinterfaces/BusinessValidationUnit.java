package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusinessValidationUnit extends PageObject {

    public static final Target BUSINESS_VALIDATION = Target.the("Validar creación de unidad de negocio").located(By.xpath("//*[contains(text(), 'businessVictorL')]"));
}
