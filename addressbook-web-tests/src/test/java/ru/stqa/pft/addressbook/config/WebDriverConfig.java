package ru.stqa.pft.addressbook.config;

import ru.stqa.pft.addressbook.enums.Browser;

public class WebDriverConfig {


    public String getBaseUrl() {
        return "https://github.com";
    }


    public Browser getBrowser() {
        String browser = System.getProperty("browser", "FIREFOX");
        return Browser.valueOf(browser);
    }
}
