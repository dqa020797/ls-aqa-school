package ru.stqa.pft.addressbook.pages;

public class PageManager {

    private ContactsPage contactsPage;
    private GroupsPage groupsPage;
    private GroupPage groupPage;
    private GroupCreatePage groupCreatePage;


    public PageManager() {
        this.groupsPage = new GroupsPage();
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

    public ContactsPage contacts() {
        return contactsPage;
    }

    public ContactsPage home() {
        return contactsPage;
    }
}