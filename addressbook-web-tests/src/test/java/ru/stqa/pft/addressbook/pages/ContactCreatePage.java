package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.ContactData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class ContactCreatePage {


    public ContactCreatePage fillContactForm (ContactData contact) {
        app.contact()
           .fillContactForm(contact);
        return this;
    }

    public void submitEnter() {
        app.contact()
           .submitEnter();
    }

    public ContactCreatePage goToContactPage() {
        app.goToContactPage()
           .addNew();
        return this;
    }
}
