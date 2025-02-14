package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactHelper extends BaseHelper {

    public void createNewContact(NewContactData newContact) {
        type(find("[name='firstname']"), newContact.getFirstName());
        type(find("[name='middlename']"), newContact.getMiddleName());
        type(find("[name='lastname']"), newContact.getLastName());
        click(find("[name='submit']"));
    }
}
