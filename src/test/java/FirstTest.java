import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void openSite(){
        open("https://github.com/");
        $(".h0-mktg").shouldHave(text("Let’s build from here"));
    }
}
