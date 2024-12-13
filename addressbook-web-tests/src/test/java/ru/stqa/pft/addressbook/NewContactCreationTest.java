package ru.stqa.pft.addressbook;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class NewContactCreationTest {
    @BeforeEach
    void setUp() {
        // Открываем веб-приложение
        Selenide.open("http://localhost/addressbook/");
    }

    @Test
    void fillFormTest() {

        Login.login("admin", "secret");
        goToGroupPage ();
        GroupData group = new GroupData("Test Group", "Test Header", "Test Footer");
        createContact();

    }

    public void goToGroupPage() {
        $("[href='edit.php']").click();
    }

    public void createContact() {
        $("[name='firstname']").setValue("Dmitry");
        $("[name='middlename']").setValue("Dmitry");
        $("[name='lastname']").setValue("Dmitry");
        $("[name='submit']").click();
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();           // Закрытие браузера
    }
}
