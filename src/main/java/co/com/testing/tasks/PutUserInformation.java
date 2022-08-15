package co.com.testing.tasks;

import co.com.testing.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.testing.userinterfaces.PaymentStorePage.*;
import static co.com.testing.userinterfaces.ProductStorePage.PRODUCT_SELECTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class PutUserInformation implements Task {
    private Information information;

    public PutUserInformation(Information information) {
        this.information = information;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("el nombre es : "+ information.getFirstname());

        actor.attemptsTo(
                Scroll.to(CUSTOMER_NAME),
                Enter.theValue(information.getFirstname()).into(CUSTOMER_NAME),
                Enter.theValue(information.getLastname()).into(CUSTOMER_LASTNAME),
                SelectFromOptions.byValue("India").from(CUSTOMER_COUNTRY)




                );

    }

    public static PutUserInformation inSpace(Information information){
        return instrumented(PutUserInformation.class,information);
    }


}
