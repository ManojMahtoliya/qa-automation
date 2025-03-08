
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.Main.driver;

public class AutomationDemo {

    @BeforeClass
    public void setUp() {
        Main.initializeDriver();
    }

    @Test
    public void testOpenDemoQAWebsite() {
        driver.get("https://demoqa.com/");
        Assert.assertTrue(Main.demoQaHeader.isDisplayed());  //check header visible
    }

    @AfterClass
    public void tearDown() {
        Main.closeDriver();
    }
}
