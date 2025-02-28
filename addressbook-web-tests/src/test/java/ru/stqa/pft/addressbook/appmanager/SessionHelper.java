package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends BaseHelper {

    public void login(String username, String password) {

        SelenideElement submitLoginButton = $("[type=submit]");

        type($("[name=user]"), username);
        type($("[name=pass]"), password);
        click(submitLoginButton);
    }
}