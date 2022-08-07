package co.com.testing.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/payment_store.feature",
        tags="@payment",
        glue = "co.com.testing",
        snippets = SnippetType.CAMELCASE)

public class RunnerPayment {
}
