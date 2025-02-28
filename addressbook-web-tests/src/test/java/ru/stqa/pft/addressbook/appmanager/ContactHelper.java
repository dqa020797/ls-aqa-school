package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.model.ContactData;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends BaseHelper {

    private SelenideElement submitEnterButton = $("[name='submit']");
    private SelenideElement firstNameField = $("[name='firstname']");
    private SelenideElement middleNameField = $("[name='middlename']");
    private SelenideElement lastNameField = $("[name='lastname']");

    public void fillContactForm(ContactData contact) {
        type(firstNameField, contact.getFirstName());
        type(middleNameField, contact.getMiddleName());
        type(lastNameField, contact.getLastName());
    }

    public void submitEnter() {
        click(submitEnterButton);
    }
}