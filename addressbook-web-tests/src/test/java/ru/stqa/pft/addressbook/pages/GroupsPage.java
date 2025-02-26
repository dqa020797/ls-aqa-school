package ru.stqa.pft.addressbook.pages;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;


public class GroupsPage {

    public GroupCreatePage createNewGroup() {
        app.getGroupHelper()
           .createNew();
        return pages.groupCreate();
    }

    public GroupsPage deleteGroup() {
        app.getGroupHelper()
           .delete();
        return this;
    }

    public GroupsPage selectGroup() {
        app.getGroupHelper()
           .selectGroup();
        return this;
    }

    public GroupsPage editGroup() {
        app.getGroupHelper()
           .editGroup();
        return pages.groups();
    }

}