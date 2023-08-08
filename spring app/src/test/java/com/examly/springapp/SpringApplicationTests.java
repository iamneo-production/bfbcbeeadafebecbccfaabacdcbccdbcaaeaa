package com.examly.springapp;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SpringApplicationTests {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver = null;

    @BeforeTest
    public void beforeTest() throws Exception
     {
   // replace seleniumhost and port with correct values
        driver = new RemoteWebDriver(new URL("http://<seleniumhost:port>/"), chromeOptions);
        driver.manage().window().maximize();
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
    public void afterTest() 
    {
        driver.quit();
    }

}