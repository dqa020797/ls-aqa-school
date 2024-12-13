package ru.stqa.pft.addressbook;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GroupCreationTest {

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
        createGroup(group);
        verifyGroupCreated(group.getName());
    }
    public void createGroup(GroupData group) {
        $("[name='new']").click();                          // Нажатие кнопки создания группы
        $("[name='group_name']").setValue(group.getName()); // Ввод имени группы
        $("[name='group_header']").setValue(group.getHeader()); // Ввод заголовка группы
        $("[name='group_footer']").setValue(group.getFooter()); // Ввод подвала группы
        $("[name='submit']").click();                       // Сохранение формы
    }
    public void goToGroupPage() {
            $("[href='group.php']").click(); // Переход на страницу групп
        }

    private void verifyGroupCreated(String expectedGroupName) {
        $("[class='msgbox']").shouldHave(
                text("A new group has been entered into the address book."));
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();           // Закрытие браузера
    }
}