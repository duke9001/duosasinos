package com.duosasinos.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.duosasinos.base.BaseClass;
import com.duosasinos.pageobjects.Home;
import com.duosasinos.pageobjects.Service;
import com.duosasinos.utility.Log;

public class ServicePageTest extends BaseClass{
	
	private Service service;		

	@Test(testName = "Test software development readmore button", groups = {"sanity","regression","smoke"})
	public void TestSoftwareDevelopmentReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify home outsource readmore button");
		service.clickOnSoftwareDevelopmentReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getSoftwareDevelopmentURL();		
		extentTest.info("Verifying if user is able to login to software development page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to software development page");
	}

	
	@Test(testName = "Test research and algorithms readmore button", groups = {"sanity","regression","smoke"})
	public void TestReseachandAlgorithmsReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify research and algorithm readmore button");
		service.clickOnResearchAndAlgorithmReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getResearchWorkAndIntelligentAlgorithmsURL();		
		extentTest.info("Verifying if user is able to login to research and algorithm page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to research and algorithm page");
	}
	
	@Test(testName = "Test legacy software readmore button", groups = {"sanity","regression","smoke"})
	public void TestLegacySoftwareReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify research and algorithm readmore button");
		service.clickOnLegacySoftwareReadmoreButtonReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getLegacySoftwareURL();		
		extentTest.info("Verifying if user is able to login to legacy software page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to legacy software page");
	}
	
	@Test(testName = "Test quality assurance readmore button", groups = {"sanity","regression","smoke"})
	public void TestQualityAssuranceReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify quality assurance readmore button");
		service.clickOnQualityAssuranceReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getQualityAssuranceURL();		
		extentTest.info("Verifying if user is able to login to quality assurance page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to quality assurance page");
	}
	
	@Test(testName = "Test visual design readmore button", groups = {"sanity","regression","smoke"})
	public void TestVisualDesignReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify visual design readmore button");
		service.clickOnVisualDesignReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getVisualDesignURL();		
		extentTest.info("Verifying if user is able to login to visual design page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to visual design page");
	}
	
	@Test(testName = "Test print design readmore button", groups = {"sanity","regression","smoke"})
	public void TestPrintDesignReadmoreButton() throws Throwable {
		
		service = new Service();

		driver.get(readConfig.getServicesURL());
		extentTest.info("Navigated to Url");
		Log.startTestCase("verify print design readmore button");
		service.clickOnPrintDesignReadmoreButton();
		
		String actualURL=service.getCurrURL(); 
		String expectedURL=readConfig.getPrintDesignURL();		
		extentTest.info("Verifying if user is able to login to print design page");
		Assert.assertEquals(actualURL, expectedURL);
		extentTest.pass("Verifying if user is able to login to print design page");
	}

}
