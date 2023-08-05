import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpringApplicationTests {
    ChromeOptions chromeOptions = new ChromeOptions();
	String driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
		driver =   System.setProperty("webdriver.chrome.driver", "http://localhost:8080");
	}

	@Test
	public void testcase_1() throws InterruptedException 
{
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		
		
	}

	@Test
	public void testcase_2() throws InterruptedException 
      {
		driver.switchTo().frame(0);
	    WebElement drag= driver.findElement(By.id("draggable"));
	    WebElement drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
	    a.dragAndDrop(drag, drop).build().perform();
	}
	@Test
	public void testcase_3() throws InterruptedException 
      {
		WebElement drop=driver.findElement(By.id("droppable"));
		Assert.assertEquals(drop.getText(),"Dropped!");
	}

		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
