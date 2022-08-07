package co.com.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


import static co.com.testing.userinterfaces.HomeStorePage.ITEM_SPACE;
import static co.com.testing.userinterfaces.HomeStorePage.SEARCH_SPACE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckProduct implements Task {
    private String product;

    public CheckProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("el product en task es : " +product);
        actor.attemptsTo(
                Click.on(SEARCH_SPACE),
                SendKeys.of(product).into(ITEM_SPACE).thenHit(Keys.ENTER)
        );
    }
    public static CheckProduct itemNameSpace(String product){
        return instrumented(CheckProduct.class,product);
    }
}