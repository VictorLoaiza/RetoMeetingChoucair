package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusinessForm extends PageObject {

    public static final Target ORGANIZATION = Target.the("Click boton Organization").located(By.xpath("//*[@id='nav_menu1_3']/li[1]/a/span"));

    public static final Target BUSINESS_UNIT = Target.the("Click boton Business Unit").located(By.xpath("//*[@id='nav_menu1_3_1']/li[1]/a/i"));

    public static final Target NEW_BUSINESS_UNIT = Target.the("Click boton new business unit").located(By.xpath("//*[@class='button-inner']"));

    public static final Target BUSINESS_NAME = Target.the("Introducir nombre de business unit").located(By.xpath("//*[@name='Name']"));

    public static final Target DEPLOY = Target.the("Click lista de opciones").located(By.xpath("//*[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']/a/span[2]"));

    public static final Target PARENT_UNIT = Target.the("Click boton Parent Unit").located(By.xpath("//*[@id='select2-results-1']/li[2]"));

    public static final Target SAVE = Target.the("Click guardar business unit").located(By.xpath("//*[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar']/div/div/div/div[1]/div/span"));

}
