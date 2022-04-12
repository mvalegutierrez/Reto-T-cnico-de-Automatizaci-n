package utest2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourselfPage extends PageObject {
    public static final Target INPUT_FIRTSNAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTSNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAILADDRESS = Target.the("where do we write the email address")
            .located(By.id("email"));

    public static final Target SElECT_MONTH =Target.the("select the birthday date, enter the month")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));

    public static final Target SElECT_DAY =Target.the("select the birthday date, enter the day")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));

    public static final Target SElECT_YEAR =Target.the("select the birthday date, enter the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));

    public static final Target SELECT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    public static final Target BUTTON_NEXT = Target.the("where we press when we want continue")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
}
