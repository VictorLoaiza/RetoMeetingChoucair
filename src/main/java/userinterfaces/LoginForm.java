package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginForm extends PageObject {

    public static final Target USER_NAME = Target.the("Introducir nombre de usuario para Login").located(By.xpath("//*[@name='Username']"));

    public static final Target USER_PASSWORD = Target.the("Introducir contraseña de usuario para Login").located(By.xpath("//*[@name='Password']"));

    public static final Target SIGN_IN = Target.the("Click boton Sign in").located(By.xpath("//*[@class='btn btn-primary my-3 w-100']"));


}
