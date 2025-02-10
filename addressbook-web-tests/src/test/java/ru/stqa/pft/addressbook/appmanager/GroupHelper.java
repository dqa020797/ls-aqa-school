package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends BaseHelper {
    
    public void createGroup(GroupData group) {
        click(find("[name='new']"));
        type(find("[name='group_name']"), group.getName());
        type(find("[name='group_header']"), group.getHeader());
        type(find("[name='group_footer']"), group.getFooter());
        click(find("[name='submit']"));
    }

    public void deleteGroup() {
        click(find("[name='selected[]']"));
        click(find("[name='delete']"));
    }

    public void redactionGroup(GroupData group) {
        click(find("[name='selected[]']"));
        click(find("[name='edit']"));
        type(find("[name='group_name']"), group.getName());
        type(find("[name='group_header']"), group.getHeader());
        type(find("[name='group_footer']"), group.getFooter());
        click(find("[name='update']"));

    }
}
