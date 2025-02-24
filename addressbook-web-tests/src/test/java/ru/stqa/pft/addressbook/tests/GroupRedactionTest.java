package ru.stqa.pft.addressbook.tests;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupRedactionTest extends TestBase {

    @Test
    void GroupRedactionTest() {
        GroupData editForm = new GroupData("Test Group Edit", "Test Header Edit", "Test Footer Edit");
        pages.groups()
             .goToGroupPage()
             .selectGroup()
             .editGroup();
        pages.group()
             .editForm(editForm)
             .submitUpdate();

    }
}
