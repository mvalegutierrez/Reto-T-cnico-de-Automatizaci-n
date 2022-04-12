package utest2.stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest2.model.UtestData;
import utest2.questions.Answer;
import utest2.tasks.*;

import java.util.List;

public class utestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Valentina wants to register on the uTest platform$")
    public void thanValentinaWantsToRegisterOnTheUTestPlatform() throws Exception {
        OnStage.theActorCalled("Valentina").wasAbleTo(OpenUp.thePage(),(SingUp.onThePage()));
    }


    @When("^she sing up on Utest platform$")
    public void sheSingUpOnUtestPlatform(List<UtestData> data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(AboutYourself.onThePage(data),YourAddress.onThePage(data),YourDevices.onThePage(data),LastStep.onThePage(data));
    }

    @Then("^she navigates on platform$")
    public void sheNavigatesOnPlatform() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.onThePage());
      //  OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
