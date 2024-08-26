package org.exe;


import java.util.List;

import org.base.Base;
import org.categories.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.LoginPage;
import org.pojo.MainPage;
import org.testng.annotations.Test;



public class ExecuteMember extends Base {
	@Test
	public static void main(String[]args) throws InterruptedException {

		chromeBrowser();
		maxi();

		launchurl("http://154.61.80.127:8092/auth/signin-1");

		//Login Page

		LoginPage front = new LoginPage();
		WebElement txtmemcode = front.getMemcode();
		fillTextBox(txtmemcode,"cr7");

		WebElement txtpassword = front.getTxtpass();
		fillTextBox(txtpassword,"Password@123");

		WebElement btnlogin = front.getBtnlogin();
		clickButton(btnlogin);
		

		// Main Page
		MainPage mainPage = new MainPage();
		WebElement SlickNav = mainPage.getNavbar();
		Thread.sleep(3000);
		for(int i =0;i<=1;i++) {
			waitOneS();
		clickButton(SlickNav);
		}

		List<WebElement> categoryElements = mainPage.getitemnames();
		for (int i = 0; i < Math.min(categoryElements.size(), 18); i++) {
		    WebElement element = categoryElements.get(i);
		    waitOneS();
		    element.click();
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		}

        DashBoard dash = new DashBoard();
		waitTwoS();
		WebElement click_dash = dash.getDashboard();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_dash);
		clickButton(click_dash);

		List<WebElement> c = dash.getCards();
		for (int i = 0; i < Math.min(c.size(), 4); i++) {
			WebElement cards = c.get(i);
			waitOneS();
			mouseSelect(cards).build().perform();
		}

		waitTwoS();
		clickButton(dash.getGraph());

			//Ledger Section

		Ledger ledger = new Ledger();
		waitOneS();
		WebElement click_ledger = ledger.getLedger();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", click_ledger);
		clickButton(click_ledger);

		WebElement click_date1 = ledger.getDate1();
		waitTwoS();
		clickButton(click_date1);

		WebElement click_monthbtn = ledger.getMonth();
		for(int i =1;i<=11;i++) {
		clickButton(click_monthbtn);
		}

		WebElement pick_date = ledger.getPickDate();
		clickButton(pick_date);

		WebElement click_date2 = ledger.getDate2();
		clickButton(click_date2);
		clickButton(pick_date);

		WebElement info_btn = ledger.getBtnInfo();
		waitOneS();
		clickButton(info_btn);

		WebElement amount_value = ledger.getAmount();
		waitOneS();
		clearText(amount_value);
		fillTextBox(amount_value, "24343");

		WebElement pay_btn = ledger.getBtnInfo();
		waitOneS();
		clickButton(pay_btn);
				//OnlinePayment Section
//
//		OnlinePayment online = new OnlinePayment();
//
//		WebElement click_online = online.getOnline();
//		clickButton(click_online);
//
//		WebElement type_amount = online.getAmount();
//		waitTwoS();
//		clearText(type_amount);
//		fillTextBox(type_amount,"1500");
//
//		WebElement click_pay = online.getPaybtn();
//		clickButton(click_pay);
//
//		driver.switchTo().frame(0);
//		List<WebElement> optionsElements = online.getPayopt();
//		for (int i = 0; i < Math.min(optionsElements.size(), 7); i++)
//		{
//		    WebElement element = optionsElements.get(i);
//		    waitOneS();
//		    element.click();
//		}
//		WebElement payment_opt = online.getBankClose();
//		waitTwoS();
//		clickButton(payment_opt);
//
//		waitTwoS();
//		clickButton(online.getConfirm());
//		driver.switchTo().defaultContent();
//
//		//Event Section
//
//		Event event = new Event();
//
//		waitTwoS();
//		clickButton(event.getEvent());
//
//		waitOneS();
//		clickButton(event.getInfoBtn());
//
//		WebElement type_text1 = event.getText1();
//		waitOneS();
//		fillTextBox(type_text1, "10");
//
//		WebElement type_text2 = event.getText2();
//		waitOneS();
//		fillTextBox(type_text2, "50");
//		waitOneS();
//		clickButton(event.getRadio());
//		waitOneS();
//
//		clickButton( event.getSubmit());
//
//
//		//RoomBooking Section
//
//		RoomBooking room = new RoomBooking();
//
//		waitTwoS();
//		clickButton(room.getRoomBook());
//
//		clickButton(room.getDate1());
//
//		clickButton(room.getPickDate1());
//
//		clickButton(room.getDate2());
//
//		clickButton(room.getPickDate2());
//
//		WebElement type_adv = room.getAdvance();
//		fillTextBox(type_adv, "15000");
//
//		WebElement type_adult = room.getAdult();
//		fillTextBox(type_adult,"5");
//
//		WebElement type_child = room.getChild();
//		fillTextBox(type_child,"10");
//
//		WebElement gst_num = room.getGst();
//		fillTextBox(gst_num,"5663446278925843");
//
//		WebElement type_des = room.getDescription();
//		fillTextBox(type_des,"The room I want to talk about is the living room."
//				+ " It’s pretty big, maybe the biggest room in the whole house."
//				+ " It’s shaped like a rectangle.");
//
//		clickButton(room.getBookbtn());
//
//		clickButton(room.getSucessBtn());
//
//		//RoomsAvailablity
//		RoomsAvailable roomava = new RoomsAvailable();
//
//		waitOneS();
//		clickButton(roomava.getRooms());
//
//		waitOneS();
//		for (int i = 0; i < 2; i++) {
//			clickButton(roomava.getPrevbtn());
//		}
//
//			clickButton(roomava.getPickRoom());
//		waitOneS();
//		clickButton(roomava.getBackbtn());
//
//
//		//Order Online
//
//		OrderOnline order = new OrderOnline();
//		waitTwoS();
//		clickButton(order.getOnlinebtn());
//
//
//		String selectedCategory = "NONVEG ITEM";
//		WebElement singleitem = order.getSingleitem();
//		WebElement dropdownElement = order.getSelect();
//		Select dropdown = Base.initSelect(dropdownElement);
//		dropdown.selectByVisibleText(selectedCategory);
//		WebElement text_item = order.getTypeItem();
//
//		WebElement txt_one = order.getOneItem();
//		WebElement txt_two = order.getQuanity2();
//		waitTwoS();
//		if(singleitem.getText().equals("POT")) {
//			fillTextBox(txt_one,"10");
//			clickButton(order.getSubmit());
//
//		}
//		else{
//			fillTextBox(text_item,"Chilly Mutton");
//			waitTwoS();
//			fillTextBox(txt_two,"10");
//			clickButton(order.getSubmit());
//
//		}
//
//		waitTwoS();
//		String paytm_method = "UPI / QR";
//		WebElement dropdownelement1 = order.getPaytm();
//		Select dropdown1 = Base.initSelect(dropdownelement1);
//		dropdown1.selectByVisibleText(paytm_method);
//
//		waitTwoS();
//		clickButton(order.getOrdertype());
//
//		clickButton(order.getSubmitclick());
//		if (order.getOkbtn().isDisplayed()) {
//			clickButton(order.getOkbtn());
//		}
//
//		FacilityBooking facility = new FacilityBooking();
//
//		waitOneS();
//		clickButton(facility.getFacility());
//		waitOneS();
//		clickButton(facility.getAdditem2());
//		waitOneS();
//		clickButton(facility.getGames());
//		waitOneS();
//
//		clickButton(facility.GetDateO());
//		waitOneS();
//		clickButton(facility.getSubmit());
//		waitOneS();
//		clickButton(facility.getSlot());
//		waitOneS();
//		clickButton(facility.getSubmit2());
//		waitOneS();
//		clickButton(facility.getOkBtn());
//
//
//		//MonthlyBills
//		MonthlyBills monthly = new MonthlyBills();
//		waitOneS();
//		clickButton(monthly.getMonthly());
//		waitOneS();
//		clickButton(monthly.getFromDate());
//		waitOneS();
//
//		for (int i = 0; i < 13; i++) {
//			clickButton(monthly.getMonthbtn());
//		}
//		waitOneS();
//		clickButton(monthly.getPickup1());
//		waitOneS();
//		clickButton(monthly.getTodate());
//		waitOneS();
//		clickButton(monthly.getPickup2());
//		clickButton(monthly.getGetinfobtn());
//
//
//		//ClubVisti
//
//		ClubVisit clubVisit = new ClubVisit();
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clubVisit.getScroll());
//		waitOneS();
//		clickButton(clubVisit.getClubvisit());
//		waitOneS();
//		clickButton(clubVisit.getFromDate());
//		for (int i = 0; i < 5; i++) {
//			clickButton(clubVisit.getMonthbtn());
//		}
//		waitOneS();
//		clickButton(clubVisit.getPickup1());
//		waitOneS();
//		clickButton(clubVisit.getTodate());
//		waitOneS();
//		clickButton(clubVisit.getPickup2());
//		clickButton(clubVisit.getGetinfobtn());
//
//		Committee committee = new Committee();
//		waitTwoS();
//		clickButton(committee.getCommittee());
//
//		AffiliatedClubList affiliated = new AffiliatedClubList();
//		waitOneS();
//		clickButton(affiliated.getAffiliatedclub());
//		waitOneS();
//		clickButton(affiliated.getOneclub());
//		waitOneS();
//		clickButton(affiliated.getBackbtn());
//
//		NoticeBoard notice = new NoticeBoard();
//		waitTwoS();
//		clickButton(notice.getNoticboard());
//
//		ClubRules clubRules = new ClubRules();
//		waitOneS();
//		clickButton(clubRules.getClubrules());
//
//		FacilityInfo facilityInfo = new FacilityInfo();
//		waitOneS();
//		clickButton(facilityInfo.getFacilityinfo());
//
//		waitOneS();
//		clickButton(facilityInfo.getGolf());
//		waitOneS();
//		clickButton(facilityInfo.getBackbtn());
//
//		Feedback feedback = new Feedback();
//		waitOneS();
//		clickButton(feedback.getFeedback());
//		waitOneS();
//		clickButton(feedback.getAdd());
//		waitOneS();
//		fillTextBox(feedback.getText(),"Very decent for a short city break. " +
//				"Excellent location, central and well connected with tram/metro. " +
//				"Staff was welcoming,");
//		waitOneS();
//		clickButton(feedback.getSubmit());
//
//		clickButton(feedback.getOkBtn());
//
//		AboutUs aboutUs = new AboutUs();
//		waitTwoS();
//		clickButton(aboutUs.getAboutus());

		quitBrowser();
	}
}