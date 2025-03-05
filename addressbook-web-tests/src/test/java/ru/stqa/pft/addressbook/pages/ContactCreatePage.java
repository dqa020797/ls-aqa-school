package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.ContactData;

import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.CONTACT_IS_CREATED;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;

public class ContactCreatePage {

    public ContactCreatePage fillContactForm(ContactData contact) {
        app.getContactHelper()
           .fillContactForm(contact);
        return this;
    }

    public ContactsPage submitEnter() {
        app.getContactHelper()
           .submitEnter();

        app.getContactHelper()
           .checkTextFromMsgBox(CONTACT_IS_CREATED);

        return pages.contacts();
    }
}
