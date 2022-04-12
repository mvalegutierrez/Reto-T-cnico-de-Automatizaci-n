package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import utest2.model.UtestData;
import utest2.userinterface.AboutYourselfPage;

import java.util.List;

public class AboutYourself implements Task {
    private List<UtestData> data;

    public AboutYourself(List<UtestData> data){
     this.data = data;
    }

    public static AboutYourself onThePage(List<UtestData> data) {
        return Tasks.instrumented(AboutYourself.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(data.get(0).getStrName()).into(AboutYourselfPage.INPUT_FIRTSNAME),
            Enter.theValue(data.get(0).getStrLastname()).into(AboutYourselfPage.INPUT_LASTSNAME),
            Enter.theValue(data.get(0).getStrEmail()).into(AboutYourselfPage.INPUT_EMAILADDRESS),
            SelectFromOptions.byVisibleText(data.get(0).getStrbirthmonth()).from(AboutYourselfPage.SElECT_MONTH),
            SelectFromOptions.byVisibleText(data.get(0).getStrbirthday()).from(AboutYourselfPage.SElECT_DAY),
            SelectFromOptions.byVisibleText(data.get(0).getStryearofbirth()).from(AboutYourselfPage.SElECT_YEAR),
            Enter.theValue(data.get(0).getStrspokenlanguage()).into(AboutYourselfPage.SELECT_LANGUAGE).thenHit(Keys.ENTER),
            Click.on(AboutYourselfPage.BUTTON_NEXT)

            );
    }
}
