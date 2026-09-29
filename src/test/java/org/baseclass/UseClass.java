package org.baseclass;

import java.sql.Driver;

import org.openqa.selenium.WebElement;

public class UseClass {
	
	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
		b.browserLaunch("https://www.facebook.com/");
		
		WebElement email = b.findElementXpath("//input[@name='email']");
		
		b.sendValue(email, "anand@gmail.com");
	}

}
