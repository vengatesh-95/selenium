package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement btnnext = driver.findElement(By.xpath("//span[contains(text(),'C')]"));
	String name = btnnext.getText();
	System.out.println(name);
	
	
}
}
