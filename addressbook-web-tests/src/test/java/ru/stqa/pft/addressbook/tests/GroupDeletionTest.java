package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @BeforeEach
    public void ensurePreconditions() {
        GroupData testGroup = new GroupData("Test Group", "Test Header", "Test Footer");

        pages.home()
             .goToGroupsPage()
             .createGroupIfNotExist(testGroup);
    }

    @Test
    public void deleteGroupTest() {
        pages.home()
             .goToGroupsPage()
             .selectGroup()
             .deleteGroup();
    }
}