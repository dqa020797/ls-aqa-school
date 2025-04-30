package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreationTest() {
        var page = pages.home()
                        .goToGroupsPage();
        List<GroupData> before = app.getGroupHelper()
                                    .getGroupList();
        GroupData newGroup = new GroupData("a", "a", "Test Footer1");

        before.add(newGroup);

        page.createNewGroup()
            .fillGroupForm(newGroup)
            .submitCreate();

        List<GroupData> after = app.getGroupHelper()
                                   .getGroupList();

        assertThat(before.size())
                .as("Количество групп увеличилось на 1")
                .isEqualTo(after.size());

        assertThat(before)
                .as("В cписке групп появилась созданная, а остальные группы не изменились")
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .ignoringFields("header", "footer")
                .isEqualTo(after);

    }
}
