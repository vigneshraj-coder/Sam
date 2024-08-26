package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	public LoginPage(){PageFactory.initElements(driver, this);}

	@FindBy(name = "name")
	private WebElement txtcode; 
	public WebElement getMemcode() {return txtcode;}

	@FindBy(name="password")
	private WebElement txtpass;
	public WebElement getTxtpass() {return txtpass;}

	@FindBy(id="login-button")
	private WebElement btnlogin;
	public WebElement getBtnlogin() {return btnlogin;}

	@FindBy(xpath = "//small[@class='text-danger form-text']")
	private	WebElement errormsg;
	public WebElement getErrormsg(){return errormsg;}

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement alertmsg;
	public WebElement getAlertmsg(){return alertmsg;}
}
