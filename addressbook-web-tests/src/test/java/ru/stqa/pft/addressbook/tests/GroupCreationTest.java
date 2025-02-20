package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.Test;

public class GroupCreationTest extends TestBase {

    @Test
    void groupCreation() {
        pages.home()
                .goToGroups()
                .createNewGroup()
                .fillForm()
                .submitCreate();
        app.group().checkTextFromMsgBox();
    }

}