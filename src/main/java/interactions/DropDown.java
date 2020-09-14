package interactions;

import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static ui.dropDownPage.DROPDOWN_MULTISELECTION;
import static ui.dropDownPage.DROPDOWN_WITH_SEARCH_TEXT;

public class DropDown implements Interaction {
    private Target target;
    public String type;
    public DropDown(Target target,String type) {
        this.target = target;
        this.type=type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if ("search".equals(type)) {
            actor.attemptsTo(Click.on(target));
            actor.attemptsTo(
                    Enter.theValue("Japan").into(DROPDOWN_WITH_SEARCH_TEXT).thenHit(Keys.ENTER));

        } else if ("multi".equals(type)) {
            actor.attemptsTo(
                    Enter.theValue("California").into(target).thenHit(Keys.ENTER),
                    Enter.theValue("Alaska").into(target).thenHit(Keys.ENTER),
                    Enter.theValue("Arizona").into(target).thenHit(Keys.ENTER));
        } else if ("other".equals(type)) {
        }


    }

    public static DropDown selectValue(Target target, String type) {
        return Tasks.instrumented(DropDown.class,target,type);
    }

}
