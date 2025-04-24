package ru.stqa.pft.addressbook.model;

import lombok.Data;

@Data

public class GroupData {
    private final String name;
    private final String header;
    private final String footer;
    private int id;

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public int getId() {
        return id;
    }
}