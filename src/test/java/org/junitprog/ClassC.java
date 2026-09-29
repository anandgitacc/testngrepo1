package org.junitprog;

import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC {
	
	@Test
	public void testcase_1() {
		System.out.println("ClassC testcase_1 @Test");
	}
	
	@Test
	public void testcase_2() throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
		emailid.sendKeys("anand@gma.com");
		
		String attribute = emailid.getAttribute("value");
		
//		Assert.assertTrue(false); //failure try -> assertFalse()
		
		Assert.assertEquals("classC testcase_2", "anand@gmail.com", attribute);
		
		System.out.println(3);
		System.out.println("ClassC testcase_2 @Test");
	}
	
	
	@Test
	public void testcase_3() {
		System.out.println("ClassC testcase_3 @Test");
	}

	
}
