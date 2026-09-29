package org.testngprog;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassD {
	
	@Test
	private void tc_1() {
		System.out.println("ClassD tc_1");
	}
	
	@Test
	private void tc_2() {
		// Hard assert
//		System.out.println(1);
//		Assert.assertTrue(true);
//		System.out.println(2);
		
		// Soft Assert
		System.out.println(1);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		
		System.out.println(2);
		
		// to validate if softasserts used
		softAssert.assertAll();
		
		System.out.println(3);
		System.out.println("ClassD tc_2");
	}
	
	
	@Test
	private void tc_3() {
		System.out.println("ClassD tc_3");
	}
	


}
