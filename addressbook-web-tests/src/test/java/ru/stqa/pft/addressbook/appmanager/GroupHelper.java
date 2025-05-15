package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.ArrayList;
import java.util.List;

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
    private ElementsCollection groupsList = $$("[name='selected[]']");

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

    public void delete() {
        click(deleteGroupButton);
    }

    public void selectGroup() {
        click(selectGroupButton);
    }

    public boolean hasAtLeastOneGroup() {
        return !groupsList.isEmpty();
    }

    public Groups getGroupList() {
        Groups groups = new Groups();
        ElementsCollection elements = $$("span.group");

        for (SelenideElement element : elements) {
            int id = Integer.parseInt(element.$("input").getAttribute("value"));
            String name = element.getOwnText().trim(); // получаем только текст, без вложенных элементов
            GroupData group = new GroupData(name, null, null);
            group.setId(id);
            groups.add(group);
        }
        return groups;
    }

    public void selectGroupById(int id) {
        $("[name='selected[]'][value='" + id + "']").click();
    }
}