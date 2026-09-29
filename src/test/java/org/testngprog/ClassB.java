package org.testngprog;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(priority = 22, invocationCount = 3, enabled = false)
	private void testcase_1() {
		System.out.println("ClassB testcase_1 priority = 22");
	}
	
	@Test(priority = -150)
	private void testcase_2() {
		System.out.println("ClassB testcase_2 priority = -150");
	}
	
	@Test(priority = -3)
	private void testcase_3() {
		System.out.println("ClassB testcase_3 priority = -3");
	}
	
	@Test(priority = 100)
	private void testcase_4() {
		System.out.println("ClassB testcase_4 priority = 100");
	}
	
	@Test(invocationCount = 2)
	private void testcase_5() {
		System.out.println("ClassB testcase_5");
	}
	
	@Test(priority = 250)
	private void testcase_6() {
		System.out.println("ClassB testcase_6 priority = 250");
	}
	

}
