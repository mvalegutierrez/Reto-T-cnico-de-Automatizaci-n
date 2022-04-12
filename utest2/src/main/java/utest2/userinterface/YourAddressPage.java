package utest2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourAddressPage extends PageObject {
    public static final Target SELECT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP= Target.the("where do we write the ZIP")
            .located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY= Target.the("container the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target INPUT_COUNTRY= Target.the("where do we write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_NEXT = Target.the("where we press when we want continue")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}
