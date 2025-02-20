package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Selenide;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;

    public void init() {
        initializeHelpers();
        Selenide.open("http://localhost/addressbook/");
    }

    private void initializeHelpers() {
        sessionHelper = new SessionHelper();
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
    }


    public void stop() {
        Selenide.closeWebDriver();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}