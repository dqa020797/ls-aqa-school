package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Selenide;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private CreateGroupHelper createGroupHelper;
    private NavigationHelper navigationHelper;

    public void init() {
        Selenide.open("http://localhost/addressbook/");
        sessionHelper = new SessionHelper();
        sessionHelper.login("admin", "secret");
        initializeHelpers();
    }

    private void initializeHelpers() {
        groupHelper = new GroupHelper();
        createGroupHelper = new CreateGroupHelper();
        navigationHelper = new NavigationHelper();
    }


    public void stop() {
        Selenide.closeWebDriver();
    }

    public CreateGroupHelper getCreateGroupHelper() {
        return createGroupHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}