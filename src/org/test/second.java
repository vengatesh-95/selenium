package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse\\vengatesh\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String url= driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
}

}
