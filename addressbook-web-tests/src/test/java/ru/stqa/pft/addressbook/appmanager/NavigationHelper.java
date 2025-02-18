package ru.stqa.pft.addressbook.appmanager;

public class NavigationHelper extends BaseHelper {

    public void goToGroupPage() {
        click(find("[href='group.php']"));
    }
}