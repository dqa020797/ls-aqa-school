package ru.stqa.pft.addressbook.tests;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreationTest() {
        GroupData group = new GroupData("Test Group", "Test Header", "Test Footer");
        pages.groups()
             .goToGroupPage()
             .createNewGroup()
             .fillGroupForm(group)
             .submitCreate();
        app.group()
           .checkCreateGroupTextFromMsgBox();

    }
}