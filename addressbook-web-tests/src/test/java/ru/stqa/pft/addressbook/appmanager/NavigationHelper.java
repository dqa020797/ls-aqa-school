package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends BaseHelper {
    private SelenideElement goToGroupsPageButton = $("[href='group.php']");
    private SelenideElement goToNewContactPageButton = $("[href='edit.php']");

    public void goToGroupsPage() {
        click(goToGroupsPageButton);
    }

    public void goToNewContactPage() {
        click(goToNewContactPageButton);
    }
}