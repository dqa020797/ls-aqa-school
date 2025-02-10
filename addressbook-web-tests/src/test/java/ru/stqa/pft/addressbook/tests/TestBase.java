package ru.stqa.pft.addressbook.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {


    protected final ApplicationManager app = new ApplicationManager();

    @BeforeEach
    void setUp() {
        app.init();
    }

    public static void stop() {
        Selenide.closeWebDriver();           // Закрытие браузера
    }

}