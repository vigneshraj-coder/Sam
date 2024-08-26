package org.pojo;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base{
	
 public MainPage() {PageFactory.initElements(driver, this);}
 	
 @FindBy(id="mobile-collapse")
 private WebElement navbar;
 public WebElement getNavbar() {return navbar;}
 
 @FindBy(xpath = "//li[@class='nav-item  ']")
 private List<WebElement> items;
 public List<WebElement> getitemnames() {return items;}

 @FindBy(xpath = "//div[@class='header-h5 card-header']//h5")
 private WebElement header;
 public WebElement getCenterCategoryElement(){return header;}

 @FindBy(xpath = "//span[@class='pcoded-mtext']")
 private WebElement title;
 public WebElement getTitle(){return title;}

 @FindBy(xpath = "//div[@class='pcoded-content']")
 private WebElement pages;
 public WebElement getPages() {return pages;}
}
