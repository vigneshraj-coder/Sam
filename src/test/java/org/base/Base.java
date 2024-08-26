package org.base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	public static void maxi() { driver.manage().window().maximize(); }
	public static void chromeBrowser() { WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	public static void launchurl(String url) { driver.get(url); }
	public static void gettitle() { System.out.println(driver.getTitle()); }
	public static void currentUrl() { System.out.println(driver.getCurrentUrl()); }
	public static void implewaits() { driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	public static void waitfo(){WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));}
    public static void quitBrowser() throws InterruptedException { Thread.sleep(8000); driver.quit(); }
	public static void fillTextBox(WebElement ele, String st) { ele.sendKeys(st);}
	public static void waitOneS() throws InterruptedException {Thread.sleep(1000);}
	public static void waitTwoS() throws InterruptedException {Thread.sleep(2000);}
	public static void clearText(WebElement cle) {cle.clear();}
	public static void clickButton(WebElement press) { press.click(); }
	public static Select initSelect(WebElement element) {return new Select(element);}
	public static Actions mouseSelect(WebElement element){return new Actions(driver).click(element);}
}
