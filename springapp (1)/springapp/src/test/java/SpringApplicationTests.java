import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpringApplicationTests {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set the ChromeDriver executable path
        System.setProperty("webdriver.chrome.driver", "http://localhost:8080");

        // Create a new ChromeDriver instance
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testDragAndDrop() {
        // Navigate to the webpage
        driver.get("http://jqueryui.com/droppable/");

        // Switch to the iframe containing the draggable elements
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        // Locate the source and target elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Get the color property of the target element before the drag and drop
        String beforeColor = target.getCssValue("background-color");

        // Perform the drag and drop operation
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();

        // Get the color property of the target element after the drag and drop
        String afterColor = target.getCssValue("background-color");

        // Verify that the color has changed after the drag and drop
        Assert.assertNotEquals(beforeColor, afterColor, "Color didn't change after drag and drop");

        // Verify the text change in the target element
        String expectedText = "Dropped!";
        String actualText = target.getText();
        Assert.assertEquals(actualText, expectedText, "Text not changed as expected after drag and drop");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}
