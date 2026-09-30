package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	// instance variable
	public static WebDriver driver;
	// 1
	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	// 2
	public static WebElement findElementID(String id) {
		WebElement elementID = driver.findElement(By.id(id));
		return elementID;
	}
	// 3
	public static WebElement findElementXpath(String Xpath) {
		WebElement elementXpath = driver.findElement(By.xpath(Xpath));
		return elementXpath;
	}
	// 4
	public static void sendValue(WebElement element, String data) {
		element.sendKeys(data);
	}
	// 5 
	public static void selectDropdownElement(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
//<<<<<<< HEAD
	
//=======
	public static WebElement findElementName(String name) {
		WebElement elementName = driver.findElement(By.name(name));
		return elementName;
//>>>>>>> 4795687073afad2f12311047962a4b6639abd505
	}
	
	public static WebElement findElementText(String text) {
		WebElement elementtext = driver.findElement(By.linkText(text));
		return elementtext;
	}
	
	
	

}
