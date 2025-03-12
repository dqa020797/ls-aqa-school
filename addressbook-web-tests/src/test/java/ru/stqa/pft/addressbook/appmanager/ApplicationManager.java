package ru.stqa.pft.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import ru.stqa.pft.addressbook.config.WebDriverConfig;
import ru.stqa.pft.addressbook.enums.Browser;

public class ApplicationManager {

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;

    private WebDriverConfig config;

    public ApplicationManager() {
        config = new WebDriverConfig();
    }

    public void init() {
        configureBrowser();
        initializeHelpers();
        Selenide.open(getBaseUrl());
    }

    private void configureBrowser() {
        Browser browser = config.getBrowser();
        System.out.println("Configuring browser: " + browser);

        switch (browser) {
            case FIREFOX:
                Configuration.browser = "firefox";
                break;
            case CHROME:
            default:
                Configuration.browser = "chrome";
                break;
        }
        
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    private String getBaseUrl() {
        return System.getProperty("baseUrl", "http://localhost/addressbook/");
    }

    private void initializeHelpers() {
        sessionHelper = new SessionHelper();
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        contactHelper = new ContactHelper();
    }

    public void stop() {
        Selenide.closeWebDriver();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public static void main(String[] args) {
        ApplicationManager app = new ApplicationManager();
        app.init();
    }
}
