package ru.stqa.pft.addressbook.appmanager;

public class SessionHelper extends BaseHelper {

    public void login(String username, String password) {

        type(find("[name=user]"), username);
        type(find("[name=pass]"), password);
        click(find("[type=submit]"));
    }
}