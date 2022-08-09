import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    void test1(){
        open("http://localhost:9999");
        $("[data-test-id=city] .input__control").setValue("Майкоп");
        $("[data-test-id=date] [placeholder=\"Дата встречи\"]").setValue("13.08.2022");
        $("[data-test-id=name] [name=name]").setValue("Мамин-Сибиряк Дмитрий");
        $("[data-test-id=phone] [name=phone]").setValue("+79649971830");
        $("[data-test-id=agreement]>.checkbox__box").click();
        $("button>.button__content").click();
        $(withText("Успешно!")).should(visible, Duration.ofSeconds(20));
    }
}