package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;

public class BaseHelper {

    protected void type(SelenideElement element, String text) {
        click(element);
        element.setValue(text);
    }

    protected void click(SelenideElement element) {
        element.shouldBe(visible).click();
    }
}