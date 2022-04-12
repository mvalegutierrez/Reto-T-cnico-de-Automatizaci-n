package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import utest2.model.UtestData;
import utest2.userinterface.YourAddressPage;
import utest2.userinterface.YourDevicesPage;

import java.util.List;

public class YourDevices implements Task {

    private List<UtestData> data;

    public YourDevices(List<UtestData> data) {
        this.data = data;
    }

    public static YourDevices onThePage(List<UtestData> data) {
        return Tasks.instrumented(YourDevices.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourDevicesPage.CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(YourDevicesPage.INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(YourDevicesPage.CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(YourDevicesPage.INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(YourDevicesPage.CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(YourDevicesPage.INPUT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(YourDevicesPage.CONTAINER_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(YourDevicesPage.INPUT_MOBILE).thenHit(Keys.ENTER),
                Click.on(YourDevicesPage.CONTAINER_MODEL),
                Enter.theValue(data.get(0).getStrMobile()).into(YourDevicesPage.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(YourDevicesPage.CONTAINER_SYSTEM),
                Enter.theValue(data.get(0).getStrSystem()).into(YourDevicesPage.INPUT_SYSTEM).thenHit(Keys.ENTER),
                Click.on(YourAddressPage.BUTTON_NEXT)
        );

    }
}
