package ru.stqa.pft.addressbook.config;

import org.aeonbits.owner.Config;
import ru.stqa.pft.addressbook.enums.Browser;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://localhost/addressbook/")
    String getBaseUrl(); // Изменил на локальный сайт

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("remoteUrl")
    @DefaultValue("http://localhost:4444/wd/hub")
    URL getRemoteUrl(); // Оставим значение для удаленного запуска
}
