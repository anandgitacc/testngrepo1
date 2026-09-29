package org.junitprog;

import org.junit.Ignore;
import org.junit.Test;

public class ClassB {
	
	@Test
	public void testcase_2() {
		System.out.println("ClassB testcase_2 @Test");
	}
	
	@Test
	public void testcase_3() {
		System.out.println("ClassB testcase_3 @Test");
	}
	
	@Test
	public void testcase_1() {
		System.out.println("ClassB testcase_1 @Test");
	}
	
	@Test
	public void testcase_5() {
		System.out.println("ClassB testcase_5 @Test");
	}
	
	@Ignore // it ignores the particular test method
	@Test
	public void testcase_4() {
		System.out.println("ClassB testcase_4 @Test");
	}
	
	

}
