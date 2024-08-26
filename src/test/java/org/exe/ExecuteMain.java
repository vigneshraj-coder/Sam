// package org.exe;

// import java.util.List;

// import org.base.Base;
// import org.categories.Event;
// import org.categories.Ledger;
// import org.categories.OnlinePayment;
// import org.categories.RoomBooking;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebElement;

// import org.pojo.LoginPage;
// import org.pojo.MainPage;
// import org.testng.annotations.Test;

// public class ExecuteMain extends Base {
// 	public static void main(String[]args) throws InterruptedException {

// 		chromeBrowser();
// 		maxi();
// 		implicitwaits();
// 		launchurl("http://154.61.80.127:8092/auth/signin-1");
		
		
// 		//Login Page 
		
// 		LoginPage front = new LoginPage();
// 		WebElement txtmemcode = front.getMemcode();
// 		fillTextBox(txtmemcode,"cr7");

// 		WebElement txtpassword = front.getTxtpass();
// 		fillTextBox(txtpassword,"Password@123");
		
// 		WebElement btnlogin = front.getBtnlogin();
// 		clickButton(btnlogin);
		
		
// 		//Main Page
// 		MainPage mainpg = new MainPage();
// 		WebElement clicknav = mainpg.getNavbar();
// 		Thread.sleep(3000);
// 		for(int i =0;i<=1;i++) {
// 		clickButton(clicknav);
// 		}
		
// 		List<WebElement> categoryElements = mainpg.getitemnames();
// 		for (int i = 0; i < Math.min(categoryElements.size(), 16); i++) {
// 		    WebElement element = categoryElements.get(i);
// 		    Thread.sleep(500);
// 		    element.click();
// 		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
// 		}
		
// 		//Ledger Section
		
// 		Ledger ledger = new Ledger();
// 		WebElement click_ledger = ledger.getLedger();
// 		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", click_ledger);
// 		clickButton(click_ledger);
		
// 		WebElement click_date1 = ledger.getDate1();
// 		Thread.sleep(2000);
// 		clickButton(click_date1);
		
// 		WebElement click_monthbtn = ledger.getMonth();
// 		for(int i =1;i<=11;i++) {
// 		clickButton(click_monthbtn);
// 		}

// 		WebElement pick_date = ledger.getPickDate();
// 		clickButton(pick_date);
		
// 		WebElement click_date2 = ledger.getDate2();
// 		clickButton(click_date2);
// 		clickButton(pick_date);
				
// 		WebElement info_btn = ledger.getBtnInfo();
// 		Thread.sleep(1000);
// 		clickButton(info_btn);
		
// 		WebElement amount_value = ledger.getAmount();
// 		Thread.sleep(1000);
// 		clearText(amount_value);
// 		fillTextBox(amount_value, "24343");
		
// 		WebElement pay_btn = ledger.getBtnInfo();
// 		Thread.sleep(1000);
// 		clickButton(pay_btn);
		
// 		//OnlinePayment Section
		
// 		OnlinePayment online = new OnlinePayment();
		
// 		WebElement click_online = online.getOnline();
// 		clickButton(click_online);
		
// 		WebElement type_amount = online.getAmount();
// 		Thread.sleep(2000);
// 		clearText(type_amount);
// 		fillTextBox(type_amount,"1500");
		
// 		WebElement click_pay = online.getPaybtn();
// 		clickButton(click_pay);
		
// 		driver.switchTo().frame(0);
// 		List<WebElement> optionsElements = online.getPayopt();
// 		for (int i = 0; i < Math.min(optionsElements.size(), 7); i++)
// 		{
// 		    WebElement element = optionsElements.get(i);
// 		    Thread.sleep(1000);
// 		    element.click();
// 		}
// 		WebElement payment_opt = online.getBankClose();
// 		Thread.sleep(2000);
// 		clickButton(payment_opt);
		
// 		WebElement confirm_btn = online.getConfirm();
// 		Thread.sleep(2000);
// 		clickButton(confirm_btn);
// 		driver.switchTo().defaultContent();
		
// 	//	Event Section
		
// 		Event event = new Event();
		
// 		WebElement click_event = event.getEvent();
// 		Thread.sleep(3000);
// 		clickButton(click_event);
		
// 		WebElement get_info = event.getInfoBtn();
// 		Thread.sleep(1000);
// 		clickButton(get_info);
		
// 		WebElement type_text1 = event.getText1();
// 		Thread.sleep(1000);
// 		fillTextBox(type_text1, "10");
		
// 		WebElement type_text2 = event.getText2();
// 		Thread.sleep(1000);
// 		fillTextBox(type_text2, "50");
		
// 		WebElement radio_btn = event.getRadio();
// 		clickButton(radio_btn);
		
// 		WebElement submit_btn = event.getSubmit();
// 		Thread.sleep(1000);
// 		clickButton(submit_btn);
		
		
		
		
// //		quitBrowser();
// 	}
// }