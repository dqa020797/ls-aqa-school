package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GroupHelper extends BaseHelper {

    private SelenideElement newGroupButton = $("[name='new']");
    private SelenideElement deleteGroupButton = $("[name='delete']");
    private SelenideElement submitGroupButton = $("[name='submit']");
    private SelenideElement editGroupButton = $("[name='edit']");
    private SelenideElement submitUpdateButton = $("[name='update']");
    private SelenideElement selectGroupButton = $("[name='selected[]']");
    private SelenideElement groupNameField = $("[name='group_name']");
    private SelenideElement groupHeaderField = $("[name='group_header']");
    private SelenideElement groupFooterField = $("[name='group_footer']");
    private SelenideElement goBackToGroupsPage = $("[href='group.php']");

    public void createNew() {
        click(newGroupButton);
    }

    public void goBackToGroupsPage() {
        click(goBackToGroupsPage);
    }

    public void editGroup() {
        click(editGroupButton);
    }

    public void fillGroupForm(GroupData group) {
        type(groupNameField, group.getName());
        type(groupHeaderField, group.getHeader());
        type(groupFooterField, group.getFooter());
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

    public boolean isGroupPresent() {
        return $$("[name='selected[]']").size() > 0;
    }


}