package co.com.testing.stepdefinitions;

import co.com.testing.tasks.CheckProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

import java.io.InputStream;
import java.util.Properties;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PaymentStepDefinitons {


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }

    private EnvironmentVariables  environmentVariables;

    @Managed
    private WebDriver driver;

    Properties config = new Properties();
    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        String urlWeb = environmentVariables.getProperty("environments.qa.base.url");


        OnStage.theActorCalled("Alejandro").can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url(urlWeb)
        );
            getDriver().manage().window().maximize();
    }
    @When("User check the the product {string}")
    public void userCheckTheTheProduct(String product) {
        System.out.println("el producto es "+ product);
//        theActorInTheSpotlight().attemptsTo(
//                CheckProduct.itemNameSpace(product)
//        );
//        getDriver().getWindowHandle();
    }

    @Then("Payment should be succesful")
    public void paymentShouldBeSuccesful() {
        System.out.println("THEN");
    }




}
