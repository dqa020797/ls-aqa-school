package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class GroupPage  extends BasePage {

    public GroupPage editForm (GroupData group) {
        app.group()
           .EditForm(group);
        return this;
    }

    public void submitUpdate() {
        app.group()
           .submitUpdate();
    }
}