package ru.stqa.pft.addressbook.pages;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class HomePage  {

    public HomePage goToContactPage() {
        app.getNavigationHelper().goToNewContactPage();
        return this;
    }

    public HomePage goToGroupsPage() {
        app.getNavigationHelper()
           .goToGroupsPage();
        return this;
    }

}
