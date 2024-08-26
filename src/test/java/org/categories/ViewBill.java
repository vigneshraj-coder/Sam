package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBill extends Base {
    public ViewBill(){PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='View Bill']")
    private WebElement viewbill;
    public WebElement getViewbill(){return viewbill;}

    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement from_date;
    public WebElement getFromDate(){return from_date;}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement monthbtn;
    public WebElement getMonthbtn(){return monthbtn;}

    @FindBy(xpath = "//div[text()='8']")
    private WebElement pickup1;
    public WebElement getPickup1(){return pickup1;}

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement todate;
    public WebElement getTodate(){return todate;}

    @FindBy(xpath = "//div[@aria-label='Choose Monday, August 5th, 2024']")
    private WebElement pickup2;
    public WebElement getPickup2() {return pickup2;}

    @FindBy(xpath="(//button[@type='button'])[1]")
    private WebElement sucessbtn;
    public WebElement getinfobtn() {return sucessbtn;}

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
