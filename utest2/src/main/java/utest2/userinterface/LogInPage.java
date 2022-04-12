package utest2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage extends PageObject {
    public static final Target LOGIN_BUTTON =Target.the("Button of log in")
            .located(By.xpath("//a[contains(text(),'Log In')]"));
}
