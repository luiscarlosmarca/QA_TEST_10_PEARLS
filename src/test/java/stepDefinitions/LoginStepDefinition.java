package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {
  protected static Actor luis;
  private String pageFacebook="https://www.facebook.com/";
  @Before
  public void prepareStage() {
    luis = Actor.named("web");
    luis.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage(pageFacebook)));
    OnStage.setTheStage(new OnlineCast());
  }



  @Given("The user open facebook's page")
    public void theUserOpenFacebookPage(){
    luis.attemptsTo(
            IniciarSession.enElPortalDeGestiondeDispostivos()
    );

  }

  @When("into the acces data")
  public void intoTheAccesData() {

  }

  @Then("The user redirected to the home page")
  public void theUserRedirectedToTheHomePage() {
  }

}
