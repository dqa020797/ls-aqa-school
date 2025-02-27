package ru.stqa.pft.addressbook.pages;

public class PageManager {

    private ContactsPage contactsPage;
    private GroupsPage groupsPage;
    private GroupCreatePage groupCreatePage;
    private GroupPage groupPage;
    private ContactCreatePage contactCreatePage;

    public PageManager() {
        groupsPage = new GroupsPage();
        groupPage = new GroupPage();
        groupCreatePage = new GroupCreatePage();
        contactCreatePage = new ContactCreatePage();
        contactsPage = new ContactsPage();
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

    public ContactCreatePage contactCreate() { return contactCreatePage;
    }

    public ContactsPage home() { return contactsPage;
    }

    public ContactsPage contacts() { return contactsPage;
    }
}