package ru.stqa.pft.addressbook.tests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupRedactionTest extends TestBase {

    @Test
    public void GroupRedactionTest() {
        app.getPageManager().groupsPage().goToGroupPage();
        GroupData group = new GroupData("Test Group Redaction", "Test Header Redaction", "Test Footer Redaction");
        app.getPageManager().groupsPage().redactionGroup(group);
    }
}
