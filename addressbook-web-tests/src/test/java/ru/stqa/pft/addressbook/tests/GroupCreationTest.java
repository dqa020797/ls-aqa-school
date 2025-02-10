package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
     void groupCreation() {
        app.getNavigationHelper().goToGroupPage();
        GroupData group = new GroupData("Test Group", "Test Header", "Test Footer");
        app.getGroupHelper().createGroup(group);
        app.verifyGroupCreated();
    }

}