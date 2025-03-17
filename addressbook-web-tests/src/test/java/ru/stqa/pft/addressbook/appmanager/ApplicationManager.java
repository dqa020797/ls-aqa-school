package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;

    public void init() {
        initializeHelpers();
        Configuration.browser = System.getProperty("selenide.browser", "chrome");
        Selenide.open("http://localhost/addressbook/");
    }

    private void initializeHelpers() {
        sessionHelper = new SessionHelper();
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        contactHelper = new ContactHelper();
    }


    public void stop() {
        Selenide.closeWebDriver();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}