package co.com.testing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductStorePage extends PageObject {
    public static final Target PRODUCT_COLOR= Target.the("PRODUCT COLOR")
            .locatedBy("//*[@id=\"pa_color\"]");

    public static final Target PRODUCT_SIZE= Target.the("PRODUCT SIZE")
            .located(By.xpath("//*[@id=\"pa_size\"]"));

    public static final Target PRODUCT_SELECTION= Target.the("PRODUCT SIZE")
            .located(By.xpath("  //*[@class=\"single_add_to_cart_button button alt\"]"));

    public static final Target VIEW_CART = Target.the("View cart")
            .located(By.xpath("  //*[@class=\"button wc-forward\"]"));

    public static final Target VIEW_CART_CHECKOUT = Target.the("View cart checkout")
            .located(By.xpath("  //*[@class=\"checkout-button button alt wc-forward\"]"));
}
