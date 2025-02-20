package ru.stqa.pft.addressbook.appmanager;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends BaseHelper {

    public void goToGroupPage() {
        click($("[href='group.php']"));
    }
}