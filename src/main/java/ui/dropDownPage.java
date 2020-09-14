package ui;

import net.serenitybdd.screenplay.targets.Target;

public class dropDownPage {

    public static final Target DROPDOWN_WITH_SEARCH =  Target.the("Drop Down with Search box")
            .locatedBy("//select[@id='country']/following-sibling::*");


    public static final Target DROPDOWN_WITH_SEARCH_TEXT =  Target.the("Text Drop Down with Search box")
            .locatedBy("//span[@class='select2-search select2-search--dropdown']/*");

    public static final Target DROPDOWN_MULTISELECTION =  Target.the("Multi Select - Search and Select multiple states")
            .locatedBy("//select[@class='js-example-basic-multiple select2-hidden-accessible']/following-sibling::*//input[@type='search']");


    public static final Target DROPDOWN_SIMPLE =  Target.the("Drop-down with Category related options")
            .locatedBy("//select[@id='files']");


}
