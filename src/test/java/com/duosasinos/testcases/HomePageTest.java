package com.duosasinos.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;
import com.duosasinos.pageobjects.Home;
import com.duosasinos.utility.Log;

public class HomePageTest extends BaseClass{

	@Test(testName = "TestOutsourceReadmorebutton", groups = {"sanity"})
	public void TestOutsourceReadmorebutton() throws Throwable {
		Action action = new Action();
		Home home = new Home();		

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home outsource readmore button");
		action.implicitWait(driver, 50);
		//action.fluentWait(driver, home.getReadMore(), 50);
		action.click(driver, home.getReadMore());
		Log.info("click outsource readmore button");
		extentTest.info("click outsource readmore button");
		String actualURL=home.getCurrURL(); 
		String expectedURL="https://duosasinos.com/outsourcing/";
		Log.info("Verifying if user is able to login to outsource page");
		extentTest.info("Verifying if user is able to login to outsource page");
		Assert.assertEquals(actualURL, expectedURL);
	}
}
