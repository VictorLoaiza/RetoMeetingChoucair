package tasks;

import models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.LoginForm.USER_PASSWORD;
import static userinterfaces.MeetingForm.*;


public class MeetingCreate implements Task {

    private List<MeetingData> meetingData;

    public MeetingCreate(List<MeetingData> meetingData) {this.meetingData = meetingData;}

    public static MeetingCreate createMeeting(List<MeetingData> meetingData){
        return Tasks.instrumented(MeetingCreate.class, meetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(MEETING),
                Click.on(MEETINGS),
                Click.on(NEW_MEETING),
                Enter.theValue(meetingData.get(0).getMeetingName()).into(MEETING_NAME),
                Click.on(DEPLOY_MEETING_TYPE),
                Click.on(MEETING_TYPE),
                Enter.theValue(meetingData.get(0).getMeetingNumber()).into(MEETING_NUMBER),
                Click.on(SELECT_START_DATE),
                Click.on(START_DATE),
                Click.on(DEPLOY_HOUR_START),
                Click.on(SELECT_HOUR_START),
                Click.on(SELECT_END_DATE),
                Click.on(END_DATE),
                Click.on(DEPLOY_LOCATION),
                Click.on(LOCATION),
                Click.on(DEPLOY_HOUR_END),
                Click.on(SELECT_HOUR_END),
                Click.on(DEPLOY_UNIT),
                Click.on(UNIT),
                Click.on(DEPLOY_ORGANIZED),
                Click.on(ORGANIZED_BY),
                Click.on(DEPLOY_REPORTER),
                Click.on(REPORTER),
                Click.on(DEPLOY_ATTENDEE),
                Click.on(ATTENDEE_LIST),
                Click.on(SAVE)





                );
    }




}
