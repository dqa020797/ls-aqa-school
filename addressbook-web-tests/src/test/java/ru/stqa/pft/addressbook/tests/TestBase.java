package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    @BeforeEach
    public void setUp() {
        app.init();
    }

    @AfterEach
    public void tearDown() {
    }
}