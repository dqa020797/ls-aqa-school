package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends BaseHelper {

    private SelenideElement newGroupButton = $("[name='new']");
    private SelenideElement deleteGroupButton = $("[name='delete']");
    private SelenideElement submitGroupButton = $("[name='submit']");
    private SelenideElement editGroupButton = $("[name='edit']");
    private SelenideElement submitUpdateButton = $("[name='update']");
    private SelenideElement selectGroupButton = $("[name='selected[]']");

    public void createNew() {
        click(newGroupButton);
    }
    public void editGroup() {
        click(editGroupButton);
    }

    public void fillGroupForm(GroupData group) {
        type($("[name='group_name']"), group.getName());
        type($("[name='group_header']"), group.getHeader());
        type($("[name='group_footer']"), group.getFooter());
    }
    public void submitCreate() {
        click(submitGroupButton);
    }

    public void submitUpdate() {
        click(submitUpdateButton);
    }

    public void selectGroup() {
        click(selectGroupButton);
    }

    public void delete() {
        click(deleteGroupButton);
    }
}