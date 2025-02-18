package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.model.GroupData;

public class CreateGroupHelper extends BaseHelper{

    public void createGroup(GroupData group) {
        click(find("[name='new']"));
        type(find("[name='group_name']"), group.getName());
        type(find("[name='group_header']"), group.getHeader());
        type(find("[name='group_footer']"), group.getFooter());
        click(find("[name='submit']"));
    }

}
