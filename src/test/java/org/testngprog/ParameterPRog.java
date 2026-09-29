package org.testngprog;

import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPRog extends BaseClass {
	
	@Parameters({"user111","pass222"})
	@Test
	private void fbLogin(String emailid, String password) {
		browserLaunch("https://www.facebook.com/");
		sendValue(findElementXpath("//input[@name='email']"), emailid);
		sendValue(findElementXpath("//input[@name='pass']"), password);
	}
}
