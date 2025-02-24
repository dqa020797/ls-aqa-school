package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class GroupCreatePage {

    public GroupCreatePage fillGroupForm(GroupData group) {
        app.group()
           .fillCreateForm(group);
        return this;
    }

    public void submitCreate() {
        app.group()
           .submitCreate();
    }
}
