package co.com.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.testing.userinterfaces.HomeStorePage.ITEM_SPACE;
import static co.com.testing.userinterfaces.HomeStorePage.SEARCH_SPACE;
import static co.com.testing.userinterfaces.PaymentStorePage.CUSTOMER_COUNTRY;
import static co.com.testing.userinterfaces.ProductStorePage.*;
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
                SendKeys.of(product).into(ITEM_SPACE).thenHit(Keys.ENTER),
                SelectFromOptions.byValue("black").from(PRODUCT_COLOR),
                SelectFromOptions.byValue("32").from(PRODUCT_SIZE),
                WaitUntil.the(PRODUCT_SELECTION, WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds(),
                Click.on(PRODUCT_SELECTION),
                Click.on(VIEW_CART),
                Click.on(VIEW_CART_CHECKOUT)
        );
    }
    public static CheckProduct itemNameSpace(String product){
        return instrumented(CheckProduct.class,product);
    }
}