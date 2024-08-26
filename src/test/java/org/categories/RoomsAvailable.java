package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsAvailable extends Base {
	public RoomsAvailable() {PageFactory.initElements(driver, this);}
	
	
	@FindBy(xpath = "//span[text()='Rooms Available']")
	private WebElement roomsavailable;
	public WebElement getRooms() {return roomsavailable;}
	
	@FindBy(xpath = "//button[text()='Prev']")
	private WebElement nxtbtn;
	public WebElement getPrevbtn() {return nxtbtn;}
	
	@FindBy(xpath = "(//td[@class='td-back'])[5]")
	private WebElement pickroom;
	public WebElement getPickRoom() {return pickroom;}
	
	@FindBy(xpath = "//button[text()='Go To Book']")
	private WebElement gobackbtn;
	public WebElement getBackbtn() {return gobackbtn;}
}