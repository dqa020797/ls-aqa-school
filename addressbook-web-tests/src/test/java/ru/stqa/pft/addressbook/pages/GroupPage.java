package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;


import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.GROUP_IS_UPDATED;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;

public class GroupPage {

    public GroupPage editForm (GroupData group) {
        app.getGroupHelper()
           .fillGroupForm(group);
        return this;
    }

    public GroupsPage submitUpdate() {
        app.getGroupHelper()
           .submitUpdate();

        app.getGroupHelper()
           .checkTextFromMsgBox(GROUP_IS_UPDATED);

        return pages.groups();
    }
}