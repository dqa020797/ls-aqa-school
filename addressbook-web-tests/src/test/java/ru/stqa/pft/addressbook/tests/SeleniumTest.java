package ru.stqa.pft.addressbook.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private WebDriver driver;

    public SeleniumTest() {
        this.driver = new WebDriverProvider().get();
    }

    @Test
    public void testGithubTitle() {
        String title = driver.getTitle();
        assertEquals("GitHub: Where the world builds software · GitHub", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
