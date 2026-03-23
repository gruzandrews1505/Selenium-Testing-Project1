package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBarHandling {

    @Test
    public void f() throws Exception {
        // Initialize the Chrome Driver
        WebDriver d = new ChromeDriver();
        
        // Navigate to the practice URL
        d.get("https://practice.expandtesting.com/scrollbars");
        
        // Cast WebDriver to JavascriptExecutor
        JavascriptExecutor j = (JavascriptExecutor) d;
        
        // Locate the element (Fixed the double quote in the XPath below)
        WebElement link = d.findElement(By.xpath("//a[@class='my-link']"));
        
        // Scroll the element into the viewport
        j.executeScript("arguments[0].scrollIntoView();", link);
        
        // Brief pause to allow the scroll animation to finish
        Thread.sleep(3000);
        
        // Click the link
        link.click();
        
        // Optional: d.quit();
    }
}
