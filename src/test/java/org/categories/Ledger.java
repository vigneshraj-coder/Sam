package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ledger extends Base {

	public Ledger() {PageFactory.initElements(driver, this);}
	
	@FindBy(xpath = "//span[text()='Ledger']")
	private WebElement ledger;
	public WebElement getLedger() {return ledger;}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement date1;
	public WebElement getDate1() {return date1;}
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement clickmonth;
	public WebElement getMonth() {return clickmonth;}
	
	@FindBy(xpath = "(//*[text()='August 2023'])[2]")
	private WebElement checkaug;
	public WebElement getCheckAug() {return checkaug;}
	
	@FindBy(xpath = "(//*[text()='18'])")
	private WebElement pickdate;
	public WebElement getPickDate() {return pickdate;}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement date2;
	public WebElement getDate2() {return date2;}
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement infobtn;
	public WebElement getBtnInfo() {return infobtn;}
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement pay;
	public WebElement getPayBtn() {return pay;}
	
	@FindBy(xpath="(//input[@id='name'])[1]")
	private WebElement amount;
	public WebElement getAmount() {return amount;}

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	public WebElement getOkBtn(){return okbtn;}

	@FindBy(xpath ="//div[@class='react-datepicker__current-month']")
	private WebElement monthlabel;
	public WebElement getMonthlabel(){return monthlabel;}

	@FindBy(xpath = "//div[@role='option']")
	private WebElement randomdate;
	public WebElement getRandate(){return randomdate  ;}
	
}
