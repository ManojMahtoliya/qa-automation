
import org.example.Main;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationDemo {

    @BeforeClass
    public void setUp() {
        Main.initializeDriver();
    }

    @Test
    public void testOpenGoogle() {
        Main.openGoogle();
    }

    @Test
    public void testOpenBing() {
        Main.openBing();
    }

    @AfterClass
    public void tearDown() {
        Main.closeDriver();
    }
}
