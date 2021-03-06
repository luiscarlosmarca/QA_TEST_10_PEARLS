package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.formLoginUI.*;

public class doLogin implements Task {
    public static doLogin inFacebook() {
        return instrumented(doLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("3016827692").into(TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("test1234").into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));

    }

}
