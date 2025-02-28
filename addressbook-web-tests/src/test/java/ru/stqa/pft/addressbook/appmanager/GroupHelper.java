package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends BaseHelper {

    SelenideElement newGroupButton = $("[name='new']");

    public void createNew() {
        click(newGroupButton);
    }

    public void editGroup() {
        click($("[name='edit']"));
    }

    public void fillGroupForm(GroupData group) {
        type($("[name='group_name']"), group.getName());
        type($("[name='group_header']"), group.getHeader());
        type($("[name='group_footer']"), group.getFooter());
    }

    public void submitCreate() {
        click($("[name='submit']"));
    }

    public void submitUpdate() {
        click($("[name='update']"));
    }

    public void selectGroup() {
        click($("[name='selected[]']"));
    }

    public void delete() {
        click($("[name='delete']"));
    }
}