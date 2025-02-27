package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.enums.MessageInBoxEnum;
import ru.stqa.pft.addressbook.model.ContactData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends BaseHelper {

    public void fillContactForm (ContactData contact) {
        type($("[name='firstname']"), contact.getFirstName());
        type($("[name='middlename']"), contact.getMiddleName());
        type($("[name='lastname']"), contact.getLastName());
    }

    public void submitEnter() {
        click($("[name='submit']"));
    }
}