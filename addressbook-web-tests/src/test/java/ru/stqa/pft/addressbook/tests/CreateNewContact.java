package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateNewContact extends TestBase {
    @Test
    void contactCreationTest() {
        ContactData contact = new ContactData("Andrey", "Ivanovich", "Ivanov");
        pages.ContactCreatePage()
             .goToContactPage()
             .fillContactForm(contact)
             .submitEnter();
        app.contact()
           .checkCreateContactTextFromMsgBox();

    }
}
