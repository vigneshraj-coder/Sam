package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Committee extends Base {
    public Committee(){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//span[text()='Committee Members']")
    private WebElement committee;
    public WebElement getCommittee(){return committee;}


}
