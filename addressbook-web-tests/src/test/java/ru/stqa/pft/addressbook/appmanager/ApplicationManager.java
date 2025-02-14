package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Selenide;
import ru.stqa.pft.addressbook.pages.PageManager;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private PageManager pageManager;
    private NewContactHelper newContactHelper;


    public void init() {
        Selenide.open("http://localhost/addressbook/");
        sessionHelper = new SessionHelper();
        sessionHelper.login("admin", "secret");
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        pageManager = new PageManager(this);
        newContactHelper = new NewContactHelper();
    }

    public void verifyGroupCreated() {
        $("[class='msgbox']").shouldHave(
                text("A new group has been entered into the address book."));
    }

    public void verifyContactCreated() {
        $("[class='msgbox']").shouldHave(text("Information entered into address book."));
    }


    public PageManager getPageManager() {
        return pageManager;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }


    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public NewContactHelper getNewContactHelper() {
        return newContactHelper;
    }


}