package co.com.testing.stepdefinitions;

import co.com.testing.tasks.CheckProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PaymentStepDefinitons {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        OnStage.theActorCalled("Alejandro").wasAbleTo(
                Open.url("https://shop.demoqa.com/")
        );
        getDriver().manage().window().maximize();
    }


    @When("User check the the product {string}")
    public void userCheckTheTheProduct(String product) {
        System.out.println("el producto es "+ product);
        theActorInTheSpotlight().attemptsTo(
                CheckProduct.itemNameSpace(product)
        );
        getDriver().getWindowHandle();
    }

    @Then("Payment should be succesful")
    public void paymentShouldBeSuccesful() {
        System.out.println("THEN");
    }




}
