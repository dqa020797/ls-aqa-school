package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreation() {
        app.getPageManager().groupsPage().goToGroupPage(); 
        GroupData group = new GroupData("Test Group", "Test Header", "Test Footer");
        app.getPageManager().groupsPage().createGroup(group);
        app.verifyGroupCreated();
    }

}