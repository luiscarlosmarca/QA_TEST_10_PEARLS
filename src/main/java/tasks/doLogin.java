package tasks;

import models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static models.builder.UserModerBuilder.newUser;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.formLoginPage.*;

public class doLogin implements Task {

   private UserModel user;

    public doLogin(UserModel user) {
        this.user = user;
    }

    public static doLogin inFacebook() {
        return instrumented(doLogin.class,newUser().ForDefault().build());
    }
    public static doLogin inFacebook(UserModel user) {
        return instrumented(doLogin.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user.getUsername()).into(TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(user.getPass()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));

    }

}
