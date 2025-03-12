package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @BeforeEach
    public void ensurePreconditions() {
        pages.home()
             .goToGroupsPage()
             .ensureGroupExists();
    }

    @Test
    public void deleteGroupTest() {
        pages.home()
             .goToGroupsPage()
             .selectGroup()
             .deleteGroup();
    }
}