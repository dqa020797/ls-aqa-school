package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class GroupCreatePage {
    public GroupCreatePage fillForm(GroupData group) {
        app.group().fillCreateForm(group);
        return this;
    }

    public void submitCreate() {
        //TODO
        //TODO понять, какую страницу возвращать
    }
}
