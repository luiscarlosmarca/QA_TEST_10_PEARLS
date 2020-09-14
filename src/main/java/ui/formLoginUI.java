package ui;

import net.serenitybdd.screenplay.targets.Target;

public class formLoginUI {

    public static final Target TXT_USERNAME =  Target.the("Text box for into username")
            .locatedBy("//input[@id='email']");

    public static final Target TXT_PASSWORD =  Target.the("Text box for into password")
            .locatedBy("//input[@id='pass']");


    public static final Target BTN_LOGIN =  Target.the("Button for do login")
            .locatedBy("//button[@name='login']");


}
