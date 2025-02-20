package ru.stqa.pft.addressbook.appmanager;

import ru.stqa.pft.addressbook.model.GroupData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends BaseHelper {

    public void checkTextFromMsgBox() {
        $("[class='msgbox']").shouldHave(text("A new group has been entered into the address book."));
    }

    public void createNew() {
        click($("[name='new']"));
    }

    public void fillCreateForm(GroupData group) {
        type($("[name='group_name']"), group.getName());
        type($("[name='group_header']"), group.getHeader());
        type($("[name='group_footer']"), group.getFooter());
    }

    public void submitCreate() {
        click($("[name='submit']"));
    }

    public void selectGroup() {
        click($("[name='selected[]']"));
    }

    public void backGroupPage() {
        click($("[href='group.php']"));
    }

    public void delete() {
        click($("[name='delete']"));
    }
}