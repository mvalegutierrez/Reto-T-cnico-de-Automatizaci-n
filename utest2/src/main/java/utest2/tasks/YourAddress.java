package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import utest2.model.UtestData;
import utest2.userinterface.YourAddressPage;

import java.util.List;

public class YourAddress implements Task {

    private List<UtestData> data;
    public YourAddress(List<UtestData> data) {
        this.data = data;
    }


    public static YourAddress onThePage(List<UtestData> data) {
        return Tasks.instrumented(YourAddress.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(data.get(0).getStrCity()).into(YourAddressPage.SELECT_CITY),
            Hit.the(Keys.ARROW_DOWN).into(YourAddressPage.SELECT_CITY),
            Hit.the(Keys.ENTER).into(YourAddressPage.SELECT_CITY),
            Enter.theValue(data.get(0).getStrZip()).into(YourAddressPage.INPUT_ZIP),
            Click.on(YourAddressPage.CONTAINER_COUNTRY),
            Enter.theValue(data.get(0).getStrCountry()).into(YourAddressPage.INPUT_COUNTRY).thenHit(Keys.ENTER),
            Click.on(YourAddressPage.BUTTON_NEXT)



            );
    }
}
