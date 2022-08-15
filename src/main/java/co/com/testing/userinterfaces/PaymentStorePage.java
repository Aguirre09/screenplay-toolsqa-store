package co.com.testing.userinterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class PaymentStorePage extends PageObject {
    public static final Target SECURITY = Target.the("Sign in")
            .located(By.className("account"));

    public static final Target CUSTOMER_NAME = Target.the("User's Name")

            .located(By.name("billing_first_name"));
    public static final Target CUSTOMER_LASTNAME = Target.the("User's LastName")
            .located(By.name("billing_last_name"));

    public static final Target CUSTOMER_COUNTRY = Target.the("User's LastName")
            .locatedBy("//span[@id=select2-billing_country-container']");
}
