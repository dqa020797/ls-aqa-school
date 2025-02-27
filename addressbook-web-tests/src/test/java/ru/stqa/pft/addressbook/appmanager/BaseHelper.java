package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.enums.MessageInBoxEnum;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BaseHelper {

    protected void type(SelenideElement element, String text) {
        click(element);
        element.setValue(text);
    }

    protected void click(SelenideElement element) {
        element.shouldBe(visible)
               .click();
    }

    public void checkTextFromMsgBox(MessageInBoxEnum expectedMessage) {
        $("[class='msgbox']").shouldHave(text(expectedMessage.getValue()));
    }
}