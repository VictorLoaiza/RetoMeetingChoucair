package tasks;


import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static userinterfaces.LoginForm.*;




public class Login implements Task {

    private List<LoginData> loginData;

    public Login(List<LoginData> loginData){this.loginData = loginData;}


    public static Login loginCreate(List<LoginData> loginData){
        return Tasks.instrumented(Login.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(loginData.get(0).getUserName()).into(USER_NAME),
                Enter.theValue(loginData.get(0).getPasswordKey()).into(USER_PASSWORD),
                Click.on(SIGN_IN)
                );
    }
}
