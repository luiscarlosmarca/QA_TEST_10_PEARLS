package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utils.MyWebDriverFactory;

import static ui.dropDownPage.*;

public class DropdownStepDefinition {
    private String testPage="https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html";
    protected static Actor TestUser;
    @Before
    public void prepareStage() {
        TestUser = Actor.named("TestUser");
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user open test page$")
    public void theUserOpenTestPage() {
        TestUser.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage(testPage)));
    }

    @When("^select a country$")
    public void selectACountry() {
        TestUser.attemptsTo(DropDown.selectValue(DROPDOWN_WITH_SEARCH,"search"));
    }

    @Then("^the dropdown have a new value$")
    public void theDropdownHaveANewValue() {
    }

    @When("^select some states$")
    public void selectAState() {
        TestUser.attemptsTo(DropDown.selectValue(DROPDOWN_MULTISELECTION,"multi"));

    }

    @When("^select a file$")
    public void selectAFile() {
        TestUser.attemptsTo(SelectFromOptions.byVisibleText("Java")
                .from(DROPDOWN_SIMPLE));
    }
}
