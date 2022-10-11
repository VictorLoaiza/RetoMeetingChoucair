package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingTeamValidation extends PageObject {

    public static final Target MEETING_VALIDATION = Target.the("Validate a new meeting").located(By.xpath("//*[contains(text(), 'meetingVictor')]"));
}
