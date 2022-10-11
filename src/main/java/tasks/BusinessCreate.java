package tasks;

import models.BusinessData;
import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.BusinessForm.*;

public class BusinessCreate implements Task {

    private List<BusinessData> businessData;

    public BusinessCreate(List<BusinessData> businessData){this.businessData = businessData;}

    public static BusinessCreate createBusiness(List<BusinessData> businessData){
        return Tasks.instrumented(BusinessCreate.class, businessData);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ORGANIZATION),
                Click.on(BUSINESS_UNIT),
                Click.on(NEW_BUSINESS_UNIT),
                Enter.theValue(businessData.get(0).getBusinessName()).into(BUSINESS_NAME),
                Click.on(DEPLOY),
                Click.on(PARENT_UNIT),
                Click.on(SAVE)
        );
    }
}
