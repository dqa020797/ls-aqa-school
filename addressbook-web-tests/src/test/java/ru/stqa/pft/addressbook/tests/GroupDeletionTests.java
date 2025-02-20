package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void fillFormTest() {
        app.getPageManager().groupsPage().goToGroupPage();
        app.getPageManager().groupsPage().deleteGroup();
    }

}