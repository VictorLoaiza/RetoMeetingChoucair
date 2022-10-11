package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MeetingForm extends PageObject {

    public static final Target MEETING = Target.the("Click en Meeting").located(By.xpath("//*[@id='nav_menu1_3']/li[2]/a/em"));

    public static final Target MEETINGS = Target.the("Click en Meetings").located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a/span"));

    public static final Target NEW_MEETING = Target.the("Click en new meeting").located(By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div/span"));

    public static final Target MEETING_NAME = Target.the("Introducir nombre de la meeting").located(By.xpath("//*[@class='editor s-Serenity-StringEditor s-StringEditor required']"));

    public static final Target DEPLOY_MEETING_TYPE = Target.the("seleccionar tipo de Meeting").located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']/a/span[2]"));

    public static final Target MEETING_TYPE = Target.the("seleccionar tipo de Meeting").located(By.xpath("//*[@id='select2-results-6']/li[2]"));

    public static final Target MEETING_NUMBER = Target.the("Introducir numero de meeting").located(By.xpath("//*[@name='MeetingNumber']"));

    public static final Target SELECT_START_DATE = Target.the("Desplegar fecha de inicio").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/button/i"));

    public static final Target START_DATE = Target.the("Seleccionar fecha de inicio").located(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a"));

    public  static final Target DEPLOY_HOUR_START = Target.the("Desplegar horas para reunión").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select"));

    public  static final Target SELECT_HOUR_START = Target.the("Seleccionar horas para iniciar reunión").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select/option[169]"));

    public static final Target SELECT_END_DATE = Target.the("Desplegar fecha de fin").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/button"));

    public static final Target END_DATE = Target.the("Seleccionar fecha de fin").located(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[6]/td[2]/a"));

    public  static final Target DEPLOY_HOUR_END = Target.the("Desplegar horas para finalizar reunión").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select"));

    public  static final Target SELECT_HOUR_END = Target.the("Seleccionar horas para finalizar reunión").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select/option[175]"));

    public static final Target DEPLOY_LOCATION = Target.the("Desplegar ubicaciones disponibles").located(By.xpath("//*[@id='select2-chosen-7']"));

    public static final Target LOCATION = Target.the("Seleccionar location").located(By.xpath("//*[@id='select2-results-7']/li[3]"));

    public static final Target DEPLOY_UNIT = Target.the("Desplegar unit disponibles").located(By.xpath("//*[@id='select2-chosen-8']"));

    public static final Target UNIT = Target.the("Seleccionar unit").located(By.xpath("//*[@id='select2-results-8']/li[4]"));

    public static final Target DEPLOY_ORGANIZED = Target.the("Desplegar organizaciones disponibles").located(By.xpath("//*[@id='select2-chosen-9']"));

    public static final Target ORGANIZED_BY = Target.the("Organizado por").located(By.xpath("//*[@id='select2-results-9']/li[3]"));

    public static final Target DEPLOY_REPORTER = Target.the("Desplegar reporter disponibles").located(By.xpath("//*[@id='select2-chosen-10']"));

    public static final Target REPORTER = Target.the("Seleccionar reporter").located(By.xpath("//*[@id='select2-results-10']/li[5]"));

    public static final Target DEPLOY_ATTENDEE = Target.the("Desplegar Atendee disponibles").located(By.xpath("//*[@id='select2-chosen-12']"));

    public static final Target ATTENDEE_LIST = Target.the("Attendee List").located(By.xpath("//*[@id='select2-results-12']/li[6]"));

    public static final Target SAVE = Target.the("Guardar reunion").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_Toolbar']/div/div/div/div[1]"));










}
