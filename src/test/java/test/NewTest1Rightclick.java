package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest1Rightclick {
  @Test
  public void f() {
	  

    WebDriver dr= new ChromeDriver();
    dr.get("https://practicetestautomation.com/practice-test-login/");
    WebElement we = dr.findElement(By.id("username"));
    Actions act= new Actions(dr);
    //act.moveToElement(we).contextClick().build().perform();
    act.contextClick(we).build().perform();// right click
    we.sendKeys("abcd");
    act.doubleClick(we).build().perform();// double click
  }
}
  
