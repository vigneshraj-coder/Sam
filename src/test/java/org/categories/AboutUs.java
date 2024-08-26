package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AboutUs extends Base {
    public AboutUs(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='About Us']")
    private WebElement aboutus;
    public WebElement getAboutus(){return aboutus;}
}
