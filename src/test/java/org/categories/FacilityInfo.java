package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilityInfo extends Base {
    public FacilityInfo(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Facility Info']")
    private WebElement facilityinfo;
    public WebElement getFacilityinfo(){return facilityinfo;}

    @FindBy(xpath = "(//div[@class='facility-div'])[1]")
    private WebElement golf;
    public WebElement getGolf(){return golf;}

    @FindBy(xpath = "(//i[@class='fa fa-arrow-left'])[1]")
    private WebElement backbtn;
    public WebElement getBackbtn(){return backbtn;}

}
