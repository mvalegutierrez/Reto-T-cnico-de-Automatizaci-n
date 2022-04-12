package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest2.model.UtestData;
import utest2.userinterface.LastStepPage;

import java.util.List;

public class LastStep implements Task {

    private List<UtestData> data;

    public LastStep(List<UtestData> data){
        this.data = data;
    }

    public static LastStep onThePage(List<UtestData> data) {
        return Tasks.instrumented(LastStep.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrConfirmPassword()).into(LastStepPage.INPUT_CONFIRMPASSWORD),
                Click.on(LastStepPage.INPUT_TERMOFUSE),
                Click.on(LastStepPage.INPUT_PRIVACYPOLICY),
                Click.on(LastStepPage.BUTTON_NEXT)
        );
    }
}
