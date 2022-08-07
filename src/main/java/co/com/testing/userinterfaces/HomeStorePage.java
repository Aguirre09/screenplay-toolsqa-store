package co.com.testing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeStorePage extends PageObject {
    public static final Target SEARCH_SPACE = Target.the("Put information")
            .located(By.className("noo-search"));



    public static  final  Target ITEM_SPACE = Target.the("Product")
            .located(By.xpath("//input[@name='s']"));
}
