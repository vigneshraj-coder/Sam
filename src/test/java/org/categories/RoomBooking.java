package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomBooking extends Base {

	public RoomBooking() {PageFactory.initElements(driver, this);}
	
	@FindBy(xpath= "//*[text()='Room Booking']")
	private WebElement room;
	public WebElement getRoomBook() {return room;}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement date1;
	public WebElement getDate1() {return date1;}
	
	@FindBy(xpath = "(//*[text()='1'])")
	private WebElement pickdate1;
	public WebElement getPickDate1() {return pickdate1;}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement date2;
	public WebElement getDate2() {return date2;}
	
	@FindBy(xpath = "//*[text()='8']")
	private WebElement pickdate2;
	public WebElement getPickDate2() {return pickdate2;}
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement adv;
	public WebElement getAdvance() {return adv;}
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement adult;
	public WebElement getAdult() {return adult;}
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement child;
	public WebElement getChild() {return child;}
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement gst;
	public WebElement getGst() {return gst;}
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement des;
	public WebElement getDescription() {return des;}
	
	@FindBy(xpath="//button[text()='Book Now']")
	private WebElement bookbtn;
	public WebElement getBookbtn() {return bookbtn;}
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement sucessbtn;
	public WebElement getSucessBtn() {return sucessbtn;}


	
	
  
}
