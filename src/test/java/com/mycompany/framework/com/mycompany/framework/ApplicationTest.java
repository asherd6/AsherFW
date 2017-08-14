package com.mycompany.framework.com.mycompany.framework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApplicationTest {
 @Test
	public void sblogin() {
		
	// WebDriver driver = new ChromeDriver();
	 System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	 WebDriver driver2 = new FirefoxDriver();
	 //driver2.get("http://gmail.com/");
	 
		 driver2.get("file:///D:/1.htm");
	 //WebElement elm2 = driver2.findElement(By.xpath("*[class^='whsOnd']"));
	 
	 //WebElement elm = driver2.findElement(By.cssSelector("*[class^='whsOnd']"));
	 //elm.sendKeys("sdsds");
	
	 //driver.get("www.amaric.co.il");	
	 
	}
}
