package ru.stqa.pft.addressbook.appmanager;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends BaseHelper {

    public void groups() {
        click($("[href='group.php']"));
    }
}