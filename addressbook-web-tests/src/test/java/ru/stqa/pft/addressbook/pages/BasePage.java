package ru.stqa.pft.addressbook.pages;


import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;

public abstract class BasePage {
    public ContactCreatePage goToNewContactPage() {
        app.getNavigationHelper().goToNewContactPage();
        return pages.contactCreate();
    }

    public GroupsPage goToGroupsPage() {
        app.getNavigationHelper()
                .goToGroupsPage();
        return pages.groups();
    }
}