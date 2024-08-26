package org.categories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.Base;

public class AffiliatedClubList extends Base{
    public AffiliatedClubList(){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//span[text()='Affiliated Club']")
    private WebElement affiliatedclub;
    public WebElement getAffiliatedclub() {return affiliatedclub;}

    @FindBy(xpath = "(//td[text()='Indian Airlines SC'])[1]")
    private WebElement oneclub;
    public WebElement getOneclub() {return oneclub;}

    @FindBy(xpath = "(//i[@class='\tfas fa-angle-left'])[1]")
    private WebElement backbtn;
    public WebElement getBackbtn() {return backbtn;}
}
