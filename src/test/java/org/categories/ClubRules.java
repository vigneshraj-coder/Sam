package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClubRules extends Base {
    public ClubRules(){PageFactory.initElements(driver,this);}


    @FindBy(xpath = "//span[text()='Rules']")
    private WebElement clubrules;
    public WebElement getClubrules(){return clubrules;}

}
