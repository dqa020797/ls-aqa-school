package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BaseHelper {

    protected void type(SelenideElement element, String text) {
        element.setValue(text);
    }

    protected void click(SelenideElement element) {
        element.click();
    }

    protected SelenideElement find(String cssSelector) {
        return $(cssSelector);
    }

    public static void getTextFromMsgBox() {
        $("[class='msgbox']").shouldHave( text("A new group has been entered into the address book."));
    }
}