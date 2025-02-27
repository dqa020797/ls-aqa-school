package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.CONTACT_IS_CREATED;

public class CreateNewContact extends TestBase {
    @Test
    void contactCreationTest() {
        pages.home()
                .goToNewContactPage()
                .fillContactForm(new ContactData("Andrey", "Ivanovich", "Ivanov"))
                .submitEnter();
    }
}