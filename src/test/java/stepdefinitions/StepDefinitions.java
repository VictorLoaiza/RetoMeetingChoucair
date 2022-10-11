package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.BusinessUnitValidation;
import questions.MeetingCreateValidation;
import tasks.BusinessCreate;
import tasks.Login;
import tasks.MeetingCreate;
import tasks.OpenUrl;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^The user is on the web page and login$")
    public void theUserIsOnTheWebPageAndLogin(List<LoginData> loginData) {
        theActorCalled("Victor").wasAbleTo(OpenUrl.abrirNavegador(),Login.loginCreate(loginData));

    }

    @When("^The user fill out the form to login and navigate to organization and create a business unit$")
    public void theUserFillOutTheFormToLoginAndNavigateToOrganizationAndCreateABusinessUnit(List<BusinessData> businessData) {
        theActorCalled("Victor").wasAbleTo(BusinessCreate.createBusiness(businessData));
    }

    @Then("^I see the new business unit created$")
    public void iSeeTheNewBusinessUnitCreated(List<BusinessValidation> businessValidation) {
        theActorInTheSpotlight().should(seeThat(BusinessUnitValidation.theResult(businessValidation)));
    }

    @When("^The user perform the process to create the meeting$")
    public void theUserPerformTheProcessToCreateTheMeeting(List<MeetingData> meetingData) {
        theActorCalled("Victor").wasAbleTo(MeetingCreate.createMeeting(meetingData));

    }

    @Then("^Verify that the meeting was created successfully$")
    public void verifyThatTheMeetingWasCreatedSuccessfully(List<MeetingValidation> meetingValidation) {
        theActorInTheSpotlight().should(seeThat(MeetingCreateValidation.theValidation(meetingValidation)));
    }
}
