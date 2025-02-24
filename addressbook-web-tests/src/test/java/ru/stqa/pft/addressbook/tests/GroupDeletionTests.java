package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void deleteGroupTest() {
        pages.groups()
             .goToGroupPage()
             .selectGroup()
             .deleteGroup();

    }
}