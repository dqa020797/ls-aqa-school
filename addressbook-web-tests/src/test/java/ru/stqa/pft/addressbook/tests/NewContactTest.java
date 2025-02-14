package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactTest extends TestBase {

    @Test
    public void createNewContact() {
        app.getNavigationHelper().goToNewContactPage();
        NewContactData newContact = new NewContactData("John", "Middle", "Doe");
        app.getNewContactHelper().createNewContact(newContact);
        app.verifyContactCreated();
    }
}
