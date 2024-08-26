package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoticeBoard extends Base {
    public NoticeBoard(){PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//span[text()='Notice Board']")
    private WebElement noticboard;
    public WebElement getNoticboard(){return noticboard;}




}
