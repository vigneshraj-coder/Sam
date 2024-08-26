package org.categories;

import org.base.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DashBoard extends Base {
    public DashBoard(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboard;
    public WebElement getDashboard() {return dashboard;}

    @FindBy(xpath = "//div[@class='card-body' ]")
    private List<WebElement> cards;
    public List <WebElement> getCards() {return cards;}

    @FindBy(xpath = "//div[@class='card']")
    private WebElement graph;
    public WebElement getGraph(){return graph;}
}
