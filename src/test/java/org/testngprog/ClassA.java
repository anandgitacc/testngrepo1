package org.testngprog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA {
	
	@BeforeSuite
	private void testcase_1() {
		System.out.println("ClassA testcase_1 @BeforeSuite");
	}
	
	@AfterSuite
	private void testcase_2() {
		System.out.println("ClassA testcase_2 @AfterSuite");
	}
	
	@BeforeTest
	private void testcase_3() {
		System.out.println("ClassA testcase_3 @BeforeTest");
	}
	
	@AfterTest
	private void testcase_4() {
		System.out.println("ClassA testcase_4 @AfterTest");
	}
	
	@BeforeClass
	private void testcase_5() {
		System.out.println("ClassA testcase_5 @BeforeClass");
	}
	
	@AfterClass
	private void testcase_6() {
		System.out.println("ClassA testcase_6 @AfterClass");
	}
	
	@BeforeMethod
	private void testcase_7() {
		System.out.println("ClassA testcase_7 @BeforeMethod");
	}
	
	@AfterMethod
	private void testcase_8() {
		System.out.println("ClassA testcase_8 @AfterMethod");
	}
	
	@Test
	private void testcase_9() {
		System.out.println("ClassA testcase_9 @Test");
	}
	
	@Test
	private void testcase_91() {
		System.out.println("ClassA testcase_91 @Test");
	}
	

}
