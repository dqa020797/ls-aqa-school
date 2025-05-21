package ru.stqa.pft.addressbook.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.With;

@Data
@EqualsAndHashCode
public class GroupData {
    private final String name;
    private final String header;
    private final String footer;
    private Integer id;

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public GroupData(int id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
}
