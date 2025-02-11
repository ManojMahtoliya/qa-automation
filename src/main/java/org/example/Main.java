package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static WebDriver driver;

    public static void initializeDriver() {
        // Absolute path to the chromedriver.exe
        String chromeDriverPath = "src\\main\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public static void openGoogle() {
        driver.get("https://www.google.com");
    }

    public static void openBing() {
        driver.get("https://www.bing.com");
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
