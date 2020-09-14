package stepDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import tasks.doLogin;
import utils.MyWebDriverFactory;

public class LoginStepDefinition {
  protected static Actor luis;
  private String pageFacebook="https://www.facebook.com/";
  @Before
  public void prepareStage() {
    luis = Actor.named("web");
    OnStage.setTheStage(new OnlineCast());
  }
  @Given("The user open facebook's page")
    public void theUserOpenFacebookPage(){
    luis.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage(pageFacebook)));
  }
  @When("into the acces data")
  public void intoTheAccesData() {
    luis.attemptsTo(doLogin.inFacebook());
  }

  @Then("The user redirected to the home page")
  public void theUserRedirectedToTheHomePage() {
  }

}
