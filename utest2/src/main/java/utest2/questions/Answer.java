package utest2.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utest2.userinterface.LogInPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer (String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
       return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String login = Text.of(LogInPage.LOGIN_BUTTON).viewedBy(actor).asString();
        if (question.equals(login)){
            result = true;
        }else{
            result=false;
        }
        return result;
    }
}
