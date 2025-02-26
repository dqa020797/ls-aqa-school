package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class GroupPage {

    public GroupPage editForm (GroupData group) {
        app.getGroupHelper()
           .editForm(group);
        return this;
    }

    public void submitUpdate() {
        app.getGroupHelper()
           .submitUpdate();
    }
}