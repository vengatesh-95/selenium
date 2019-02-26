package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement r = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement t = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions acc= new Actions(driver);
		acc.dragAndDrop(s,d).perform();
		acc.dragAndDrop(r,t).perform();
		
	}
}