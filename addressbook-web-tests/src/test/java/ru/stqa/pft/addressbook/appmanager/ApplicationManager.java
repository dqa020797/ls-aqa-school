package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Selenide;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;


    public void init() {
        initializeHelpers();
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

    public GroupHelper group () {
        return groupHelper;
    }

    public ContactHelper contact () {
        return contactHelper;
    }

    public NavigationHelper goToGroupsPage() {
        return navigationHelper;
    }

    public NavigationHelper goToContactPage() {
        return navigationHelper;
    }

    public SessionHelper session() {
        return sessionHelper;
    }
}