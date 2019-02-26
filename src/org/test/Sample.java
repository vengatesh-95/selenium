package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
	WebElement txtusrnam= driver.findElement(By.id("identifierId"));
	txtusrnam.sendKeys("vengatesh1202");
	WebElement btnlogin= driver.findElement(By.xpath("//content[@class='CwaK9']"));
	btnlogin.click();
	Thread.sleep(5000);
	WebElement txtpss = driver.findElement(By.xpath("//input[@type='password']"));
	txtpss.sendKeys("hkhhhlil");
	WebElement btnnxt= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	btnnxt.click();
	
	
	
	
	
}
}

