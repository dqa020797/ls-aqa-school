package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.pages.PageManager;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();
    public static PageManager pages;

    @BeforeAll
    static void setUp() {
        app.init();
        pages = new PageManager();
        app.session().login("admin", "secret");
    }

    @AfterAll
    public static void tearDown() {
        app.stop();
    }
}