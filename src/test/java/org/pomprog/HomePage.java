package org.pomprog;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("https://www.facebook.com/");
		Thread.sleep(1000);
		
		FbLoginPage fbLoginPage = new FbLoginPage();
		
		WebElement emailid = fbLoginPage.getEmailid();
		emailid.sendKeys("anand@gmail.com");
		
		WebElement password = fbLoginPage.getPassword();
		password.sendKeys("pass@123");
		
		// page refresh
		driver.navigate().refresh(); Thread.sleep(2000);
		
		emailid.sendKeys("kumar@gmail.com");
		password.sendKeys("pass@456");
	}

}
