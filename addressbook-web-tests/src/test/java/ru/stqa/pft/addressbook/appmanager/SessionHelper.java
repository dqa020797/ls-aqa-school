package ru.stqa.pft.addressbook.appmanager;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends BaseHelper {

    public void login(String username, String password) {

        type($("[name=user]"), username);
        type($("[name=pass]"), password);
        click($("[type=submit]"));
    }
}