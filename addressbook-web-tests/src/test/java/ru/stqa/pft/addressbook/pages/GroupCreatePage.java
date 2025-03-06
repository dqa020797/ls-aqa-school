package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.GROUP_IS_CREATED;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;

public class GroupCreatePage {

    public GroupCreatePage fillGroupForm(GroupData group) {
        app.getGroupHelper()
           .fillGroupForm(group);
        return this;
    }

    public GroupsPage submitCreate() {
        app.getGroupHelper()
           .submitCreate();

        app.getGroupHelper()
           .checkTextFromMsgBox(GROUP_IS_CREATED);

        app.getGroupHelper().goBackToGroupsPage();

        return pages.groups();
    }
}
