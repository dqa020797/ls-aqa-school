package ru.stqa.pft.addressbook.enums;

public enum MessageInBoxEnum {
    CONTACT_IS_CREATED("Information entered into address book. add next or return to home page."),
    GROUP_IS_CREATED("A new group has been entered into the address book."),
    GROUP_IS_UPDATED("Group record has been updated."),
    GROUP_IS_DELETED("Group has been removed.");


    String value;

    MessageInBoxEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
