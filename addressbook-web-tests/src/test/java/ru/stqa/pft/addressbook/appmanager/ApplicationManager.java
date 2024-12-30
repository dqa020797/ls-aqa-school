package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import ru.stqa.pft.addressbook.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public void init() {
        Selenide.open("http://localhost/addressbook/");
        sessionHelper = new SessionHelper();
        sessionHelper.login("admin", "secret");
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper(groupHelper);
    }

    public void verifyGroupCreated() {
        $("[class='msgbox']").shouldHave(
                text("A new group has been entered into the address book."));
    }


    @AfterEach
    public void tearDown() {
        TestBase.stop();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}