package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static WebDriver driver;

    public static void initializeDriver() {
        String chromeDriverPath = "src\\main\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        PageFactory.initElements(driver, Main.class);
    }

    @FindBy(css = "header a[href='https://demoqa.com']")
    public static WebElement demoQaHeader;


    public static void openGoogle() {
        driver.get("https://www.google.com");
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
