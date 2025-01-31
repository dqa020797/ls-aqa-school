package ru.stqa.pft.addressbook.pages;
import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Selenide.open;

public class GroupsPage extends BasePage {

    public GroupsPage(ApplicationManager app) {
        super(app);
    }

    @BeforeEach
    public void openPage() {
        open("http://localhost/addressbook/group.php");
    }

    public GroupsPage createGroup(GroupData group) {
        app.getGroupHelper().createGroup(group);
        return this;
    }

    public GroupsPage deleteGroup() {
        app.getGroupHelper().deleteGroup();
        return this;
    }

    public GroupsPage goToGroupPage() {
        app.getNavigationHelper().goToGroupPage();
        return this;
    }

    public GroupsPage redactionGroup(GroupData group) {
        app.getGroupHelper().redactionGroup(group);
        return this;
    }
}