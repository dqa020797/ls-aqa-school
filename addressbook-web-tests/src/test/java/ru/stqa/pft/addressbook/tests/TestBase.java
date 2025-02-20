package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    static public ApplicationManager app = new ApplicationManager();

    @BeforeAll
    static void setUp() {
        app.init();

        app.getSessionHelper().login("admin", "secret");
    }

    @AfterAll
    public static void tearDown() {
        app.stop();
    }
}