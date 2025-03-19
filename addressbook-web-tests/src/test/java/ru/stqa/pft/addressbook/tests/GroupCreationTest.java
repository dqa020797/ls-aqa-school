package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static com.codeborne.selenide.Selenide.refresh;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreationTest() {
        pages.home()
             .goToGroupsPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        System.out.println("Before size: " + before.size());

        GroupData newGroup = new GroupData( "Test Group", "Test Header", "Test Footer");
        pages.home()
             .goToGroupsPage()
             .createNewGroup()
             .fillGroupForm(newGroup)
             .submitCreate();

        List<GroupData> after = app.getGroupHelper().getGroupList();
        System.out.println("After size: " + after.size());

        assertEquals(before.size() + 1, after.size(), "Количество групп после добавления не совпадает");
    }
}
