package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.HomePage.SPN_POST;

public class TheHome implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SPN_POST.resolveFor(actor).isPresent();
    }
    public static TheHome PageOfFacebook(){
        return new TheHome();
    }

}
