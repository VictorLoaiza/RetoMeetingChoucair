package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.SerenityDemo;

public class OpenUrl implements Task {

    SerenityDemo openPage;

    public static OpenUrl abrirNavegador(){
        return Tasks.instrumented(OpenUrl.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(openPage));
    }
}
