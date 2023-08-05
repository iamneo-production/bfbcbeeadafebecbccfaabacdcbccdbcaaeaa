package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.*;
import org.testng.Assert;
import org.testng.annotations.*;

@SpringBootTest
public class AppTest {

    @Autowired
    private WebDriver driver;

    @Bean
    public WebDriver getWebDriver() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        return new ChromeDriver();
    }

    @Test
    public void testcase_1() throws InterruptedException {
        driver.navigate().to("https://jqueryui.com/droppable/");
    }

    @Test
    public void testcase_2() throws InterruptedException {
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(drag, drop).build().perform();
    }

    @Test
    public void testcase_3() throws InterruptedException {
        WebElement drop = driver.findElement(By.id("droppable"));
        Assert.assertEquals(drop.getText(), "Dropped!");
    }

    @AfterTest
    public void afterTest() {
        // Close the browser
        driver.quit();
    }
}
