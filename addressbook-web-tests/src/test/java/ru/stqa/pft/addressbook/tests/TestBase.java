package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    static public ApplicationManager app = new ApplicationManager();

    @BeforeEach
    void setUp() {
        app.init();
    }

    @AfterEach
    public void tearDown() {
        app.stop();
    }
}
