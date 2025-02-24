package ru.stqa.pft.addressbook.pages;

import org.junit.jupiter.api.BeforeEach;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {

    public LoginPage(ApplicationManager app) {
//        super(app);
    }

    @BeforeEach
    public void openPage() {
        open("http://localhost/addressbook/");
    }

}