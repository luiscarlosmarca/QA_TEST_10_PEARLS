package ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target SPN_POST =  Target.the("Span for create a post")
            .locatedBy("//span[contains(text(),'Crear publicación')]");
}
