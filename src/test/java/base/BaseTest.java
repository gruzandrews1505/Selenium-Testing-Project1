package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	protected WebDriver dr;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		dr = new ChromeDriver();
		Thread.sleep(3000);
		dr.get("https://sauce-demo.myshopify.com/account/register");
		dr.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
	}

}