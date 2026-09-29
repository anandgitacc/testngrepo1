package org.junitprog;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA extends BaseClass {
	
	@BeforeClass
	public static void testcase_1() {
		// browser launch / intialization
		browserLaunch("https://www.facebook.com/");
		System.out.println("ClassA testcase_1 @BeforeClass");
	}
	
	@AfterClass
	public static void testcase_2() {
		// report / browser close / final info / msg
		// report
		closeBrowser();
//		driver.close();
		System.out.println("ClassA testcase_2 @AfterClass");
	}
	
	@Before
	public void testcase_3() {
		// starting time / screenshot
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("start time : "+currentTimeMillis);
		// screenshot coding
		System.out.println("ClassA testcase_3 @Before");
	}
	
	@After
	public void testcase_4() {
		// ending time / screenshot
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println("end time : "+currentTimeMillis1);
		// screenshot coding
		System.out.println("ClassA testcase_4 @After");
	}
	
	@Test
	public void testcase_5() {
		// element finding / test data
		WebElement emailid = findElementXpath("//input[@name='email']");
		sendValue(emailid, "anand@gmail.com");
		sendValue(findElementXpath("//input[@name='pass']"), "anand@123");
		System.out.println("ClassA testcase_5 @Test");
	}
	
//	@Test
//	public void testcase_6() {
//		System.out.println("ClassA testcase_6 @Test");
//	}
//	
//	@Test
//	public void testcase_7() {
//		System.out.println("ClassA testcase_7 @Test");
//	}
	
	

}
