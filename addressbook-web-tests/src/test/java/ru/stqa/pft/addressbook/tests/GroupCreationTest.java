package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.GROUP_IS_CREATED;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreationTest() {
        pages.home()
             .goToGroupsPage()
             .createNewGroup()
             .fillGroupForm(new GroupData("Test Group", "Test Header", "Test Footer"))
             .submitCreate();
        app.getGroupHelper()
           .checkTextFromMsgBox(GROUP_IS_CREATED);
    }
}