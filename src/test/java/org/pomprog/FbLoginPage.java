package org.pomprog;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {
	
	public FbLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(name = "email"), @FindBy(xpath = "//input[@id='_R_1h6kqsqppb6amH1_']")})
	private WebElement emailid;
	
	@FindAll({@FindBy(name = "pass"), @FindBy(xpath = "//input[@id='_R_1h6kqsqppb6amH1_']")})
	private WebElement password;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}
	

}
