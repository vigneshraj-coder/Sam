package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FacilityBooking extends Base {
        public FacilityBooking(){PageFactory.initElements(driver,this);}


    @FindBy(xpath = "//span[text()='Facility Booking']")
    private WebElement facility;
    public WebElement getFacility(){return facility;}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement additem2;
    public WebElement getAdditem2(){return additem2;}

    @FindBy(xpath = "//p[text()='BILLIARDS']")
    private WebElement games;
    public WebElement getGames(){return games;}

    @FindBy(xpath = "//div[text()='1']")
    private WebElement date;
    public WebElement GetDateO(){return date;}

    @FindBy(xpath="//button[text()='Submit']")
    private WebElement submit;
    public WebElement getSubmit(){return submit;}

    @FindBy(xpath = "//div[@class='slotlist_list_section']")
    private WebElement slot;
    public WebElement getSlot(){return slot;}

    @FindBy(xpath = "//button[text()='submit']")
    private WebElement submit2;
    public  WebElement getSubmit2(){return submit2;}

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement okbtn;
    public WebElement getOkBtn(){return okbtn;}

    @FindBy(xpath = "//button[text()='Next']")
    private WebElement nextbtn;
    public WebElement getNextbtn(){return nextbtn;}

}