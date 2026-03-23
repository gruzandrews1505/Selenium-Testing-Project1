package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import Pages1.LoginPage;


public class RegisterTest extends BaseTest {
	 @Test
	  public void run() throws InterruptedException {
		 LoginPage lp = new LoginPage(dr);
		  Thread.sleep(5000);
		  lp.enterFirstName("Tom");
		  lp.enterLastName("Cruise");
		  lp.enterEmail("tom@gmail.com");
		  lp.enterPassword("123123");
		  Thread.sleep(2000);
		  dr.findElement(By.xpath("//*[@id=\"create_customer\"]/div[7]/input")).click();
		  
		  
	  }
}