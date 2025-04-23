package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.model.GroupData;

import static ru.stqa.pft.addressbook.enums.MessageInBoxEnum.GROUP_IS_DELETED;
import static ru.stqa.pft.addressbook.tests.TestBase.app;
import static ru.stqa.pft.addressbook.tests.TestBase.pages;

public class GroupsPage extends BasePage {

    public GroupCreatePage createNewGroup() {
        app.getGroupHelper()
           .createNew();
        return pages.groupCreate();
    }

    public GroupsPage deleteGroup() {
        app.getGroupHelper()
           .delete();

        app.getGroupHelper()
           .checkTextFromMsgBox(GROUP_IS_DELETED);

        app.getGroupHelper()
           .goBackToGroupsPage();

        return pages.groups();
    }

    //TODO этот метод не выполняет свою задачу, поэтому тест падает
    //TODO Метод должен принимать GroupData group а уже в helper-метод по старинке передавать id группы
    public GroupsPage selectGroup(GroupData group) {
        app.getGroupHelper()
           .getGroupList();
        return this;
    }

    public GroupPage editGroup() {
        app.getGroupHelper()
           .editGroup();
        return pages.group();
    }

    public void createGroupIfNotExist(GroupData group) {
        if (!app.getGroupHelper().hasAtLeastOneGroup()) {
            createNewGroup()
                    .fillGroupForm(group)
                    .submitCreate();
        }
    }

}