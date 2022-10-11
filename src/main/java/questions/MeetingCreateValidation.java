package questions;

import models.MeetingValidation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.MeetingTeamValidation;

import java.util.List;

public class MeetingCreateValidation implements Question<Boolean> {

    private List<MeetingValidation> meetingValidation;

    public MeetingCreateValidation(List<MeetingValidation> meetingValidation) {this.meetingValidation = meetingValidation;    }

    public static MeetingCreateValidation theValidation(List<MeetingValidation> meetingValidation){
        return new MeetingCreateValidation(meetingValidation);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean ValidationMeeting;

        String confirmationMeeting = Text.of(MeetingTeamValidation.MEETING_VALIDATION).viewedBy(actor).asString();

        if (meetingValidation.get(0).getValidateMeeting().equals(confirmationMeeting)){
            ValidationMeeting = true;
        }else{
            ValidationMeeting = false;
        }
        return ValidationMeeting;
    }
}
