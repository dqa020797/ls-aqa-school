package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;

import ru.stqa.pft.addressbook.model.ContactData;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends BaseHelper {

   private SelenideElement submitEnterButton = $("[name='submit']");

    public void fillContactForm (ContactData contact) {
        type($("[name='firstname']"), contact.getFirstName());
        type($("[name='middlename']"), contact.getMiddleName());
        type($("[name='lastname']"), contact.getLastName());
    }

    public void submitEnter() {
        click(submitEnterButton);
    }
}