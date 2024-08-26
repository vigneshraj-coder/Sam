package org.categories;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Feedback extends Base {
    public Feedback(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Feedback']")
    private WebElement feedback;
    public WebElement getFeedback(){return feedback;}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement add;
    public WebElement getAdd(){return add;}

    @FindBy(xpath = "//textarea[@type='text']")
    private WebElement text;
    public WebElement getText(){return text;}

    @FindBy(xpath = "//button[@type='button']")
    private WebElement submit;
    public WebElement getSubmit(){return submit;}

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement okbtn;
    public WebElement getOkBtn(){return okbtn;}
}
