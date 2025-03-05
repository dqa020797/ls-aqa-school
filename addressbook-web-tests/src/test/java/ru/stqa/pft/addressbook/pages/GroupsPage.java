package ru.stqa.pft.addressbook.pages;
import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.GROUP_IS_DELETED;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;


public class GroupsPage extends BasePage {

    public GroupCreatePage createNewGroup() {
        app.getGroupHelper()
           .createNew();
        return pages.groupCreate();
    }

    public GroupsPage deleteGroup() {
        app.getGroupHelper()
           .delete();

        app.getGroupHelper()
           .checkTextFromMsgBox(GROUP_IS_DELETED);

        return pages.groups();
    }

    public GroupsPage selectGroup() {
        app.getGroupHelper()
           .selectGroup();
        return this;
    }

    public GroupPage editGroup() {
        app.getGroupHelper()
           .editGroup();
        return pages.group();
    }

}