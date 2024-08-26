package org.exe;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.base.Base;
import org.categories.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.*;
import org.testng.annotations.*;

	public class Demo extends Base {
		static String  url = "https://wellingtongymkhanaclub.com:9098/auth/signin-1";



		//Login Page
		@Test(priority = 0)
		public static void loginPageSection() throws InterruptedException {

			chromeBrowser();
			maxi();
			implewaits();
			launchurl(url);

			//Login Page
			LoginPage front = new LoginPage();
			waitTwoS();
			WebElement txtusername = front.getMemcode();
			WebElement txtpassword = front.getTxtpass();
			WebElement btnlogin = front.getBtnlogin();
			clickButton(btnlogin);

			WebElement errormsg = front.getErrormsg();
			WebElement alertmsg = front.getAlertmsg();

			if (errormsg.isDisplayed()) {
				waitOneS();
				fillTextBox(txtusername, "demo");
				clickButton(btnlogin);
				if (errormsg.isDisplayed()) {
					waitOneS();
					fillTextBox(txtusername, Keys.CONTROL + "a" + Keys.DELETE);
					fillTextBox(txtpassword, "098765432");
					clickButton(btnlogin);
					if (errormsg.isDisplayed()) {
						waitOneS();
						fillTextBox(txtusername, Keys.CONTROL + "a" + Keys.DELETE);
						fillTextBox(txtpassword, Keys.CONTROL + "a" + Keys.DELETE);
						fillTextBox(txtusername, "cr7");
						fillTextBox(txtpassword, "password");
						clickButton(btnlogin);
						if (alertmsg.isDisplayed()) {
							waitOneS();
							fillTextBox(txtusername, Keys.CONTROL + "a" + Keys.DELETE);
							fillTextBox(txtpassword, Keys.CONTROL + "a" + Keys.DELETE);
							fillTextBox(txtusername, "demo");
							fillTextBox(txtpassword, "Password@123");
							clickButton(btnlogin);
							if (alertmsg.isDisplayed()) {
								waitOneS();
								fillTextBox(txtusername, Keys.CONTROL + "a" + Keys.DELETE);
								fillTextBox(txtpassword, Keys.CONTROL + "a" + Keys.DELETE);
								fillTextBox(txtusername, "demo");
								fillTextBox(txtpassword, "password");
								clickButton(btnlogin);
								if (alertmsg.isDisplayed()) {
									waitOneS();
									fillTextBox(txtusername, Keys.CONTROL + "a" + Keys.DELETE);
									fillTextBox(txtpassword, Keys.CONTROL + "a" + Keys.DELETE);
									fillTextBox(txtusername, "111");
									fillTextBox(txtpassword, "muc@123");
									clickButton(btnlogin);
								}
							}
						}
					}
				}
			}
		}
		// Main Page
		@Test(priority = 1)
		public void mainPageSection() throws InterruptedException {
			MainPage mainPage = new MainPage();
			WebElement SlickNav = mainPage.getNavbar();
			Thread.sleep(3000);
			for (int i = 0; i <= 1; i++) {
				clickButton(SlickNav);
			}
			List<WebElement> categoryElements = mainPage.getitemnames();
			for (int i = 0; i < Math.min(categoryElements.size(), 8); i++) {
				WebElement element = categoryElements.get(i);
				WebElement title = mainPage.getTitle();
				waitOneS();
				element.click();
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			}
		}
		//Ledger Section
		@Test(priority = 2)
		public static void ledgerPage() throws InterruptedException {
			Ledger ledger = new Ledger();
			waitOneS();
			WebElement click_ledger = ledger.getLedger();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", click_ledger);
			clickButton(click_ledger);

			WebElement click_date1 = ledger.getDate1();
			waitTwoS();
			clickButton(click_date1);
			WebElement info_btn = ledger.getBtnInfo();
			clickButton(info_btn);
			
			LocalDate currentDate = LocalDate.now();
        	DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        	String currentMonthYear = currentDate.format(monthYearFormatter);
			int dayOfMonth = currentDate.getDayOfMonth();

			WebElement click_monthbtn = ledger.getMonth();
			for (int i = 1; i <= 6; i++) {
				clickButton(click_monthbtn);
			}
			WebElement pick_date = ledger.getPickDate();
			clickButton(pick_date);

			waitOneS();
			clickButton(info_btn);
			waitOneS();
			if (ledger.getOkBtn().isDisplayed()) {
            clickButton(ledger.getOkBtn());
            WebElement click_date2 = ledger.getDate2();
			waitTwoS();
            clickButton(click_date2);
			
			while (true) {
                WebElement monthYearLabel = ledger.getMonthlabel();
                if (monthYearLabel.getText().equals(currentMonthYear)) {
                    break;
                }
            }
				WebElement pick_date1 = ledger.getRandate();
				pick_date1 = driver.findElement(By.xpath("//div[text()='" + dayOfMonth + "']"));
				clickButton(pick_date1);

            waitOneS();
            clickButton(info_btn);

            WebElement amount_value = ledger.getAmount();
            waitOneS();
            WebElement pay_btn = ledger.getBtnInfo();
            clickButton(pay_btn);
//            fillTextBox(amount_value, "24343");
//            waitTwoS();
//            clickButton(pay_btn);
        } else {
            System.out.println("Not getting defect");
        }
		}
		//ViewBill Section
		@Test(priority = 3)
		public static void viewBill() throws InterruptedException {

			ViewBill view = new ViewBill();
			clickButton(view.getViewbill());
			waitOneS();
			WebElement infobtn = view.getinfobtn();
			WebElement okbtn = view.getOkBtn();
			clickButton(view.getinfobtn());
			if (okbtn.isDisplayed()){
				clickButton(okbtn);
				clickButton(view.getFromDate());
				waitOneS();
				for (int i = 0; i < 5; i++) {
					clickButton(view.getMonthbtn());
				}
					waitTwoS();
					clickButton(view.getPickup1());
					waitOneS();
					clickButton(view.getTodate());
					LocalDate currentDate = LocalDate.now();
					DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
					String currentMonthYear = currentDate.format(monthYearFormatter);
					int dayOfMonth = currentDate.getDayOfMonth();

					while (true) {
						WebElement monthYearLabel = view.getMonthlabel();
						if (monthYearLabel.getText().equals(currentMonthYear)) {
							break;
						}
					}
					WebElement randate = view.getRandate();
					randate = driver.findElement(By.xpath("//div[text()='" + dayOfMonth + "']"));
					clickButton(randate);
					clickButton(infobtn);
				}
		}
		//OnlinePayment Section
		@Test(priority = 4)
		public static void onlinePay() throws InterruptedException {
			OnlinePayment online = new OnlinePayment();

			WebElement click_online = online.getOnline();
			waitTwoS();
			clickButton(click_online);
			WebElement click_pay = online.getPaybtn();
			WebElement type_amount = online.getAmount();
			WebElement ok_btn = online.getOkBtn();
			waitTwoS();
			fillTextBox(type_amount, Keys.CONTROL + "a" + Keys.DELETE);
			waitOneS();
			clickButton(click_pay);
			if (ok_btn.isDisplayed()) {
				waitOneS();
				clickButton(ok_btn);
				waitOneS();
				fillTextBox(type_amount, "1500");
				clickButton(click_pay);
			} else {
				clearText(type_amount);
				fillTextBox(type_amount, "1500");
				clickButton(click_pay);
			}
			driver.switchTo().frame(0);
			List<WebElement> optionsElements = online.getPayopt();
			for (int i = 0; i < Math.min(optionsElements.size(), 7); i++) {
				WebElement element = optionsElements.get(i);
				waitOneS();
				element.click();
			}
			WebElement payment_opt = online.getBankClose();
			waitTwoS();
			clickButton(payment_opt);

			waitTwoS();
			clickButton(online.getConfirm());
			driver.switchTo().defaultContent();
		}
		///Event Section
		@Test(priority = 5)
		public void eventList() throws InterruptedException {

			Event event = new Event();

			waitTwoS();
			clickButton(event.getEvent());
			List<WebElement> eventCards = event.getInfoBtn();
			if (eventCards.size() == 0) {
				System.out.println("No cards found ");
				return;
			}

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			for (int i = 1; i < eventCards.size(); i++) {
				System.out.println(i);
				WebElement card = eventCards.get(i);
				waitTwoS();
				clickButton(card);
				WebElement type_text1 = event.getText1();
				wait.until(ExpectedConditions.visibilityOf(type_text1));
				if (type_text1.isEnabled()) {
					fillTextBox(type_text1, "10");
				} else {
					System.out.println("Text box 1 is disabled");
				}

				WebElement type_text2 = event.getText2();
				wait.until(ExpectedConditions.visibilityOf(type_text2));
				if (type_text2.isEnabled()) {
					fillTextBox(type_text2, "50");
				} else {
					System.out.println("Text box 2 is disabled");
				}

				WebElement radio = event.getRadio();
				wait.until(ExpectedConditions.elementToBeClickable(radio));
				clickButton(radio);

				driver.navigate().back();
			}
		}
				//RoomBooking Section
				@Test(priority = 6)
				public void roombook() throws InterruptedException {
					RoomBooking room = new RoomBooking();

							waitTwoS();
							clickButton(room.getRoomBook());

							clickButton(room.getDate1());

							clickButton(room.getPickDate1());

							clickButton(room.getDate2());

							clickButton(room.getPickDate2());

							WebElement type_adv = room.getAdvance();
							fillTextBox(type_adv, "15000");

							WebElement type_adult = room.getAdult();
							fillTextBox(type_adult,"5");

							WebElement type_child = room.getChild();
							fillTextBox(type_child,"10");

							WebElement gst_num = room.getGst();
							fillTextBox(gst_num,"5663446278925843");

							WebElement type_des = room.getDescription();
							fillTextBox(type_des,"The room I want to talk about is the living room."
									+ " It’s pretty big, maybe the biggest room in the whole house."
									+ " It’s shaped like a rectangle.");

							clickButton(room.getBookbtn());
							clickButton(room.getSucessBtn());

				}
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
		//		clickButton(facility.getNextbtn());
		//		waitOneS();
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
		//
		@AfterClass
		public void exitBrowser() throws InterruptedException {
			if (driver != null) {
				quitBrowser();
			}
		}
	}

//}