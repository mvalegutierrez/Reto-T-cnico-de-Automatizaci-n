package utest2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class utestSingUpPage extends PageObject {
    public static final Target SINGUP_BUTTON = Target.the("button that shows us the form to sing up ")
            .located(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
}
