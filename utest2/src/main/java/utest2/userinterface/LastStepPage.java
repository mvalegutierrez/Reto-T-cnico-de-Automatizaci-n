package utest2.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LastStepPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));

    public static final Target INPUT_TERMOFUSE = Target.the("where do term of use")
            .located(By.id("termOfUse"));

    public static final Target INPUT_PRIVACYPOLICY = Target.the("where do acept privacy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_NEXT = Target.the("where we press when we want continue")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));


}
