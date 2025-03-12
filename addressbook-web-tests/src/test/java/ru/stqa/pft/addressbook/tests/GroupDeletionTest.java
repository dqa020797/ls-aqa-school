package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void deleteGroupTest() {
        if (app.getGroupHelper().isGroupPresent()) {
            System.out.println("Группа найдена, удаляем...");
            pages.home()
                 .goToGroupsPage()
                 .selectGroup()
                 .deleteGroup();
        } else {
            System.out.println("Группы нет, создаем и удаляем.");
            pages.home()
                 .goToGroupsPage()
                 .createNewGroup()
                 .fillGroupForm(new GroupData("Test Group", "Test Header", "Test Footer"))
                 .submitCreate()
                 .selectGroup()
                 .deleteGroup();
        }
    }
}
