import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browser = "FireFox";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Elizaveta");
        $("#userEmail").setValue("eliska@bk.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Yessentuki");
        $("#submit").click();

        $("#output").shouldHave(text("Elizaveta"),text("eliska@bk.ru"),text("Moscow"),text("Yessentuki"));
    }

}
