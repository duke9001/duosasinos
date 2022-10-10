package com.duosasinos.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;
import com.duosasinos.pageobjects.Home;
import com.duosasinos.pageobjects.Outsource;
import com.duosasinos.utility.Log;

public class HomePageTest extends BaseClass{
	
	private Home home;		

	@Test(testName = "Test outsource readmore button", groups = {"sanity","regression","smoke"})
	public void TestOutsourceReadmorebutton() throws Throwable {
		
		home = new Home();

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home outsource readmore button");
		home.clickOnoutSourceReadMore();
		
		String actualURL=home.getCurrURL(); 
		String expectedURL=readConfig.getOutsourcingURL();		
		extentTest.info("Verifying if user is able to login to outsource page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to outsource page");
	}
	
	@Test(testName = "Test slider teams readmore button", groups = {"regression"})
	public void TestSliderTeamsReadmorebutton() throws Throwable {
		
		home = new Home();

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home slider team readmore button");
		home.clickOnSliderTeamReadmore();
		
		String actualURL=home.getCurrURL(); 
		String expectedURL=readConfig.getWorkwithusURL();		
		extentTest.info("Verifying if user is able to login to work with us page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to work with us page");
		
	}
	
	@Test(testName = "Test slider our services readmore button", groups = {"regression"})
	public void TestSliderOurServicesReadmorebutton() throws Throwable {
		
		home = new Home();

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home slider team readmore button");
		home.clickOnSliderOurServicesReadmore();
		
		String actualURL=home.getCurrURL(); 
		String expectedURL=readConfig.getServicesURL();		
		extentTest.info("Verifying if user is able to login to services page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to services page");
		
	}
	
	@Test(testName = "Test slider duosasinos readmore button", groups = {"regression"})
	public void TestSliderDuosasinosReadmorebutton() throws Throwable {
		
		home = new Home();

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home slider duosasinos readmore button");
		boolean result = home.clickOnSliderDuosasinosReadmore();
		
		extentTest.info("Verifying user automatically redirect to weare section");
		Assert.assertTrue(result);
		extentTest.pass("Verifying user automatically redirect to weare section");
		
	}
	
	@Test(testName = "Test slider duosasinos readmore button", groups = {"regression"})
	public void TestScrollbutton() throws Throwable {
		
		home = new Home();

		driver.get(readConfig.getBaseURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify scroll button");
		boolean result = home.clickOnScrollButton();
		Assert.assertTrue(result);
		extentTest.pass("Verifying scroll button");
		
	}
}
