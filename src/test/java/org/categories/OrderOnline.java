package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOnline extends Base {
	public OrderOnline() {PageFactory.initElements(driver, this);}
	
	@FindBy(xpath = "//span[text()='Online Order']")
	private WebElement online;
	public WebElement getOnlinebtn() {return online;}
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement selectitem;
	public WebElement getSelect() {return selectitem;}
	
	@FindBy(xpath = "(//td[text()='CHILLY MUTTON'])[1]")
	private WebElement singleitem;
	public WebElement getSingleitem() {return singleitem;}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement typeitem;
	public WebElement getTypeItem() {return typeitem;}
	
	@FindBy(xpath = "(//tr//td//input)[31]")
	private WebElement oneitem;
	public WebElement getOneItem() {return oneitem;}
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement submit;
	public WebElement getSubmit() {return submit;}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/table/tbody/tr/td[3]/input")
	private WebElement quanity;
	public WebElement getQuanity2() {return quanity;}

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement paytem;
	public WebElement getPaytm(){return paytem;}

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement submit_click;
	public WebElement getSubmitclick(){ return submit_click;}

	@FindBy(xpath = "(//span[text()='TakeAway'])[1]")
	private WebElement ordertype;
	public WebElement getOrdertype(){return ordertype;}

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	public WebElement getOkbtn(){return okbtn;}

	
	
}


