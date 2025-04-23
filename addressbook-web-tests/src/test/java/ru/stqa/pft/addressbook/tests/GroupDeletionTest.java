package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        pages.home().goToGroupsPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData deleted = before.iterator().next();

        pages.groups()
             .selectGroup(deleted)
             .deleteGroup();

        List<GroupData> after = app.getGroupHelper().getGroupList();

        assertEquals(before.size() - 1, after.size(), "Размеры списка групп после удаления не совпадают");

        before.remove(deleted);
        assertEquals(before, after, "Группы после удаления не совпадают с ожидаемыми");
    }
}