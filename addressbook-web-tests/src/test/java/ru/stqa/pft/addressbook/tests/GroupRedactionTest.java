package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupRedactionTest extends TestBase {

    @BeforeEach
    public void ensurePreconditions() {
        GroupData testGroup = new GroupData("Test Group", "Test Header", "Test Footer");

        pages.home()
             .goToGroupsPage()
             .createGroupIfNotExist(testGroup);
    }

    @Test
    void groupRedactionTest() {
        pages.home()
             .goToGroupsPage()
             .selectGroup(0)
             .editGroup()
             .editForm(new GroupData("Test Group Edit", "Test Header Edit", "Test Footer Edit"))
             .submitUpdate();
    }
}
