package org.categories;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePayment extends Base {

	public OnlinePayment() {PageFactory.initElements(driver, this);}
	
	@FindBy(xpath = "(//*[text()='Online Payment'])[1]")
	private WebElement online;
	public WebElement getOnline() {return online;}
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement amount;
	public WebElement getAmount() {return amount;}

	@FindBy(xpath = "//button[@type='button']")
	private WebElement paybtn;
	public WebElement getPaybtn(){return paybtn;}
		 
	@FindBy(xpath = "//label[@class='relative cursor-pointer']")
	private List<WebElement> payopt;
	public List<WebElement> getPayopt(){return payopt;}
	
	@FindBy(xpath = "//button[@data-testid='checkout-close']")
	private WebElement bankclose;
	public WebElement getBankClose(){return bankclose;}
	
	@FindBy(xpath = "//button[@data-test-id='confirm-positive']")
	private WebElement confirm;
	public WebElement getConfirm() {return confirm;}

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	public WebElement getOkBtn(){return okbtn;}
	
}
