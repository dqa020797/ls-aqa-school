package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.enums.MessageInBoxEnum;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends BaseHelper {

    public void createNew() {
        click($("[name='new']"));
    }

    public void editGroup() {
        click($("[name='edit']"));
    }

    public void fillGroupForm(GroupData group) {
        type($("[name='group_name']"), group.getName());
        type($("[name='group_header']"), group.getHeader());
        type($("[name='group_footer']"), group.getFooter());
    }

    public void editForm(GroupData group) {
        type($("[name='group_name']"), group.getName());
        type($("[name='group_header']"), group.getHeader());
        type($("[name='group_footer']"), group.getFooter());
    }

    public void submitCreate() {
        click($("[name='submit']"));
    }


    public void submitUpdate() {
        click($("[name='update']"));
    }

    public void  selectGroup() {
        click($("[name='selected[]']"));
    }

    public void delete() {
        click($("[name='delete']"));
    }
}