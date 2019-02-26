package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOverActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btnnext = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(driver);                                                                                                                                                  
		acc.moveToElement(btnnext).perform();
		WebElement btnbigdata=driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		btnbigdata.click();
		WebElement contact=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		contact.click();
		

}
}