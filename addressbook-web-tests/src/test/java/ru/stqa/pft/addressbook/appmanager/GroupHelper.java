package ru.stqa.pft.addressbook.appmanager;

public class GroupHelper extends BaseHelper {

    public void selectGroup() {
        click(find("[name='selected[]']"));
    }

    public void backGroupPage() {
        click(find("[href='group.php']"));
    }

    public void deleteGroup() {
        click(find("[name='delete']"));
    }
}