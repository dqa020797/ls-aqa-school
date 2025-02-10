package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class PageManager {

    private final GroupsPage groupsPage;


    public PageManager(ApplicationManager app) {
        this.groupsPage = new GroupsPage(app);
    }

    public GroupsPage groupsPage() {
        return groupsPage;
    }

}