package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Event extends Base{

	public Event() {PageFactory.initElements(driver, this);}
	
	
	@FindBy(xpath = "//*[text()='Event']")
	private WebElement txtevent;
	public WebElement getEvent() {return txtevent;}
	
	@FindBy(xpath = "//button[@type= 'button']")
	private List<WebElement> infobtn;
	public List<WebElement> getInfoBtn() {return infobtn;}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement text1;
	public WebElement getText1() {return text1;}
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement text2;
	public WebElement getText2() {return text2;}
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement radio;
	public WebElement getRadio() {return radio;}
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement submit;
	public WebElement getSubmit() {return submit;}

	@FindBy(xpath = "//div[@class='card-body']")
	private List<WebElement> cardsection;
	public List<WebElement> getCardsection(){return cardsection;}
	
}

