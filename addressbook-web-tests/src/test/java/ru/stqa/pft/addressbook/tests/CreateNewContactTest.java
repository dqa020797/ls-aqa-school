package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateNewContactTest extends TestBase {
    @Test
    void contactCreationTest() {
        pages.home()
             .goToNewContactPage()
             .fillContactForm(new ContactData("Andrey", "Ivanovich", "Ivanov"))
             .submitEnter();
    }
}