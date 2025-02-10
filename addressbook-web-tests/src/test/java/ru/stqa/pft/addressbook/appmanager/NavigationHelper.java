package ru.stqa.pft.addressbook.appmanager;

public class NavigationHelper extends BaseHelper {
    private GroupHelper groupHelper;

    public NavigationHelper(GroupHelper groupHelper) {
        this.groupHelper = groupHelper;
    }

    public void goToGroupPage() {
        click(find("[href='group.php']"));
    }
}