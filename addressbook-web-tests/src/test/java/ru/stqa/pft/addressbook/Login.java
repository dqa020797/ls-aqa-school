package ru.stqa.pft.addressbook;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    public static void login (String username, String password) {
        $("[name=user]").setValue(username);   // Ввод имени пользователя
        $("[name=pass]").setValue(password);  // Ввод пароля
        $("[type=submit]").click();           // Нажатие кнопки входа
    }
}
