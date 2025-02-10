package ru.stqa.pft.addressbook.pages;

import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public abstract class BasePage {
    protected ApplicationManager app;

    public BasePage (ApplicationManager app) {
        this.app = app;
    }


}