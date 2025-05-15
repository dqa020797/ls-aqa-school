package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupRedactionTest extends TestBase {

    @BeforeEach
    public void ensurePreconditions() {
        GroupData testGroup = new GroupData("Test Group", "Test Header", "Test Footer");

        pages.home()
                .goToGroupsPage()
                .createGroupIfNotExist(testGroup);
    }

    @Test
    public void groupRedactionTest() {
        pages.home().goToGroupsPage();

        Groups before = app.getGroupHelper().getGroupList();
        GroupData modifiedGroup = before.iterator().next();

        GroupData group = new GroupData(modifiedGroup.getId(), "Test Group Edit", "Test Header Edit", "Test Footer Edit");

        pages.groups()
                .selectGroup(modifiedGroup)
                .editGroup()
                .editForm(group)
                .submitUpdate();

        Groups after = app.getGroupHelper().getGroupList();

        assertThat(after)
                .as("Группы после редактирования не совпадают с ожидаемыми")
                .isEqualTo(before.without(modifiedGroup).withAdded(new GroupData(modifiedGroup.getId(), "Test Group Edit", null, null)));
    }
}
