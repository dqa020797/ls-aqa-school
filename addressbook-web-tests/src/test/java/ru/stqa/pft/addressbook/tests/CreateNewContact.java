package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateNewContact extends TestBase {
    @Test
    void contactCreationTest() {
        pages.home()
             .goToContactPage();
        pages.contactCreate()
             .fillContactForm(new ContactData("Andrey", "Ivanovich", "Ivanov"))
             .submitEnter();
        app.getContactHelper()
           .checkCreateContactTextFromMsgBox();

    }
}
