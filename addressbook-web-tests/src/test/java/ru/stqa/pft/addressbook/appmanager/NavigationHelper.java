package ru.stqa.pft.addressbook.appmanager;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends BaseHelper {

    public void goToGroupsPage() {
        click($("[href='group.php']"));
    }
    public void goToNewContactPage() {
        click($("[href='edit.php']"));
    }
}