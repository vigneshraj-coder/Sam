package org.categories;


import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ClubVisit extends Base {

    public ClubVisit(){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//span[text()='Club Visit']")
    private WebElement clubvisit;
    public WebElement getClubvisit(){return clubvisit;}

    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement from_date;
    public WebElement getFromDate(){return from_date;}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement monthbtn;
    public WebElement getMonthbtn(){return monthbtn;}

    @FindBy(xpath = "(//div[text()='1'])[1]")
    private WebElement pickup1;
    public WebElement getPickup1(){return pickup1;}

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement todate;
    public WebElement getTodate(){return todate;}

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, July 30th, 2024']")
    private WebElement pickup2;
    public WebElement getPickup2() {return pickup2;}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement getinfobtn;
    public WebElement getGetinfobtn() {return getinfobtn;}

    @FindBy(xpath = "(//span[@class = 'pcoded-mtext'])[18]")
    private WebElement scroll;
    public WebElement getScroll(){return scroll;}
}
