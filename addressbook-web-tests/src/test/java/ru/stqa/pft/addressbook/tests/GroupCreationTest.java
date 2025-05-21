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

        int count = 0;
        GroupData createdGroup = null;

        for (GroupData groupAfter : after){
            boolean match = false;
            for (GroupData groupBefore : before){
                match = groupAfter.equals(groupBefore);
                if (match)
                    break;
            }
            if (!match){
                count++;
                createdGroup = groupAfter;
            }

        }

        assertThat(after.size())
                .as("Количество групп увеличилось на 1")
                .isEqualTo(before.size() + 1);

        assertThat(count)
                .isEqualTo(1);

        assertThat(createdGroup)
                .usingRecursiveComparison()
                        .ignoringFields("header", "footer", "id")
                .isEqualTo(newGroup);


        assertThat(after.without(createdGroup))
                .as("В списке групп появилась созданная, а остальные группы не изменились")
                .usingRecursiveComparison()
                //.ignoringCollectionOrder()
                .ignoringFields("header", "footer")
                .isEqualTo(before);
    }
}
