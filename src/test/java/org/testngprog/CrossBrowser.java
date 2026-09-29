package org.testngprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@Test
	private void fbLogin(String browserName) {
		
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("anand@gamil.com");
	}

}
