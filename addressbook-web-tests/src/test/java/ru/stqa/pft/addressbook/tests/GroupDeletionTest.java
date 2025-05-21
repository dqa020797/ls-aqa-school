package ru.stqa.pft.addressbook.tests;

import org.assertj.core.api.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.List;

import static com.google.common.base.Predicates.equalTo;
import static com.google.common.io.MoreFiles.equal;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
        Groups before = app.getGroupHelper().getGroupList();
        GroupData deleted = before.iterator().next();

        pages.groups()
                .selectGroup(deleted)
                .deleteGroup();

        Groups after = app.getGroupHelper().getGroupList();

        assertEquals(before.size() - 1, after.size(), "Размеры списка групп после удаления не совпадают");

        assertThat(after)
                .withFailMessage("Группы после удаления не совпадают с ожидаемыми")
                .isEqualTo(before.without(deleted));
    }
}