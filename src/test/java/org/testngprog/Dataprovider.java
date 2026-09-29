package org.testngprog;

import org.baseclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends BaseClass {

	@Test(dataProvider = "fblogin")
	private void fbLogin(String emailid, String password) {
		browserLaunch("https://www.facebook.com/");
		sendValue(findElementXpath("//input[@name='email']"), emailid);
		sendValue(findElementXpath("//input[@name='pass']"), password);
	}

	// for mapping the test data
	@DataProvider(name = "fblogin", parallel = true)
	private Object[][] dataProv() {

		Object[][] data = new Object[3][2];
		// 0th row
		data[0][0] = "anand@gmail.com";
		data[0][1] = "anand@123";
		// 1st row
		data[1][0] = "siva@gmail.com";
		data[1][1] = "siva@123";
		// 2nd row
		data[2][0] = "jeeva@gmail.com";
		data[2][1] = "jeeva@123";

		return data;
	}
}
