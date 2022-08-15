package co.com.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class GetUrlBrowser implements Question<String> {
    public static GetUrlBrowser getUrlBrowser(){
        return new GetUrlBrowser();


    }

    @Override
    public String answeredBy(Actor actor) {
        // return PAGE.resolveFor(actor).getText();
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }
}
