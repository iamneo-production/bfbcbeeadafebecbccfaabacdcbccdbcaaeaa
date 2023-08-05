package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServer;
import org.springframework.util.Assert;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}
	public class AppTest {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebServer driver = null;
	
		@BeforeTest
		public void beforeTest() throws Exception {
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
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
	

}
