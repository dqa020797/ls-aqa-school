package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreationTest() {
        var page = pages.home()
                .goToGroupsPage();
        Groups before = app.getGroupHelper()
                .getGroupList();
        GroupData newGroup = new GroupData("a", "a", "Test Footer1");

        page.createNewGroup()
                .fillGroupForm(newGroup)
                .submitCreate();

        app.getGroupHelper().goBackToGroupsPage();

        Groups after = app.getGroupHelper()
                .getGroupList();

        assertThat(after.size())
                .as("Количество групп увеличилось на 1")
                .isEqualTo(before.size() + 1);

        int newId = after.stream()
                .mapToInt(GroupData::getId)
                .max()
                .orElseThrow();
        newGroup.setId(newId);

        Groups expected = before.withAdded(newGroup);

        assertThat(after)
                .as("Проверяем, что новая группа добавлена")
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .ignoringFields("header", "footer")
                .isEqualTo(expected);

    }
}
