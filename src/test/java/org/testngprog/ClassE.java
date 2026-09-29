package org.testngprog;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class ClassE extends BaseClass {
	
	@Test
	private void tc_1() {
		browserLaunch("https://www.facebook.com/");
		System.out.println("ClassE tc_1");
	}
	
	@Test
	private void tc_2() {
		browserLaunch("https://demo.automationtesting.in/Register.html");
		System.out.println("ClassE tc_2");
	}
	
	@Test
	private void tc_3() {
		browserLaunch("https://www.instagram.com/");
		System.out.println("ClassE tc_3");
	}

}
