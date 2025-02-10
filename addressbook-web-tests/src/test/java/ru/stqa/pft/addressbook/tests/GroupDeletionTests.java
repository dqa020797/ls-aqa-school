package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void fillFormTest() {

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().backGroupPage();


    }

}

