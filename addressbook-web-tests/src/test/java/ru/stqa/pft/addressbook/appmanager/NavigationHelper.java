package ru.stqa.pft.addressbook.appmanager;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper() {
    }

    public void goToGroupPage() {
        click(find("[href='group.php']"));
    }

}