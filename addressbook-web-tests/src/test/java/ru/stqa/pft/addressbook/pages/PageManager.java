package ru.stqa.pft.addressbook.pages;

public class PageManager {

    private HomePage homePage;
    private GroupsPage groupsPage;
    private GroupCreatePage groupCreatePage;
    private GroupPage groupPage;
    private ContactCreatePage contactCreatePage;



    public PageManager() {
        this.groupsPage = new GroupsPage();
        this.groupPage = new GroupPage();
        this.groupCreatePage = new GroupCreatePage();
        this.contactCreatePage = new ContactCreatePage();
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

    public ContactCreatePage ContactCreatePage() {
        return contactCreatePage;
    }

    public HomePage home() {
        return homePage;
    }
}