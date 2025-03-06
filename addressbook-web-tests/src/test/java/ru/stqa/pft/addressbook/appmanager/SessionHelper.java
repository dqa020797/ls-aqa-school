package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends BaseHelper {

    SelenideElement usernameField = $("[name='user']");
    SelenideElement passwordField = $("[name='pass']");
    SelenideElement submitLoginButton = $("[type=submit]");

    public void login(String username, String password) {

        type(usernameField, username);
        type(passwordField, password);
        click(submitLoginButton);
    }
}