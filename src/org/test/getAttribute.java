package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement btnnext = driver.findElement(By.name("email"));
			btnnext.sendKeys("venky");
			String name = btnnext.getAttribute("value");
			System.out.println(name);
			

}
}
