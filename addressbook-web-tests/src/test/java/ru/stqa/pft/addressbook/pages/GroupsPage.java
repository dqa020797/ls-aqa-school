package ru.stqa.pft.addressbook.pages;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;


public class GroupsPage {
    @BeforeEach
    public void openEditGroupPage() {
        open("http://localhost/addressbook/group.php");
    }

    public GroupCreatePage createNewGroup() {
        app.group()
           .createNew();
        return pages.groupCreate();
    }

    public GroupsPage deleteGroup() {
        app.group()
           .delete();
        return this;
    }

    public GroupsPage selectGroup() {
        app.group()
           .selectGroup();
        return this;
    }

    public GroupsPage goToGroupPage() {
        app.goToGroupsPage()
           .groups();
        return this;
    }

    public GroupsPage editGroup() {
        app.group()
           .editGroup();
        return pages.groups();
    }

}