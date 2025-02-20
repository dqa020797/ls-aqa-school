package ru.stqa.pft.addressbook.pages;

import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Selenide.open;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;


public class GroupsPage extends BasePage {
    @BeforeEach
    public void openPage() {
        open("http://localhost/addressbook/group.php");
    }

    public GroupCreatePage createNewGroup() {
        app.group().createNew();
        return pages.groupCreate();
    }

    public GroupsPage deleteGroup() {
        app.group().delete();
        return this;
    }

    public GroupsPage goToGroupPage() {
        app.goTo().groups();
        return this;
    }

    public GroupsPage redactionGroup(GroupData group) {
        // app.getGroupHelper().redactionGroup(group);
        return this;
    }
}