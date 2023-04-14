import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.byName;

public class CssXpathExamples {

    void CssXpathExamples() {

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//*[@id='email']").setValue("1");
        $x("//input[@id='email']").setValue("1");

        $("[name=email]").setValue("1");
        $(Selectors.byName("email"));

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".login_form_input_box.inputtext").setValue("1");
        $("input.login_form_input_box.inputtext").setValue("1");
        $x("//input[@class='login_form_input_box'][@class='inputtext']").setValue("1");

                /*
           <div class="inputtext>
                <input type="email" class="login_form_input_box">
           </div>
         */
        $(".login_form_input_box .inputtext").setValue("1");
        $(".login_form_input_box").$(".inputtext").setValue("1");


        // <div>Hello qa.guru</div>
        $x("//div[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa guru!"));
        $(withText("llo, qa.gur"));


    }
    }


