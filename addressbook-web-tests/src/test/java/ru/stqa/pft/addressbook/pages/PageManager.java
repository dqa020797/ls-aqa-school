package ru.stqa.pft.addressbook.pages;

public class PageManager {

    private HomePage homePage;
    private GroupsPage groupsPage;
    private GroupCreatePage groupCreatePage;
    private GroupPage groupPage;


    public PageManager() {
        this.groupsPage = new GroupsPage();
        this.groupPage = new GroupPage();
        this.groupCreatePage = new GroupCreatePage();
    }

    public GroupsPage groups() {
        return groupsPage;
    }

    public GroupPage group() {
        return groupPage;
    }

    public GroupCreatePage groupCreate() {
        return groupCreatePage;
    }

    public HomePage home() {
        return homePage;
    }
}