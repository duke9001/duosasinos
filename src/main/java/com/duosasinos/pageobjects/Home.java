/**
 * 
 */
package com.duosasinos.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;
import com.duosasinos.utility.Log;

/**
 * @author Duke
 *
 */
public class Home extends BaseClass{
	
	private Action action = new Action();
	
	@FindBy(id="slider-1-slide-3-layer-5")
	private WebElement sliderTeamReadmore;
	
	@FindBy(id="slider-1-slide-2-layer-5")
	private WebElement sliderOurServiceReadmore;
	
	@FindBy(id="slider-1-slide-1-layer-5")
	private WebElement sliderDuosasinosReadmore;
	
	@FindBy(linkText = "Read more")
	private WebElement outSourceReadMore; 
	
	@FindBy(id = "weare")
	private WebElement weare;
	
	@FindBy(tagName = "footer")
	private WebElement footer;
	
	@FindBy(tagName = "header")
	private WebElement header;
	
	@FindBy(id = "back_to_top")
	private WebElement backToTopButton;
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public Outsource clickOnoutSourceReadMore() {	
		
		action.explicitWait(driver, outSourceReadMore, 5);
		extentTest.info("click outsource readmore button");
		
		action.click(driver, outSourceReadMore);
		Log.info("click outsource readmore button");
		extentTest.pass("click outsource readmore button");
		return new Outsource();
	}
	
	public WorkWithUs clickOnSliderTeamReadmore() {
		
		action.explicitWait(driver, sliderTeamReadmore, 20);
		extentTest.info("click slider team readmore button");
		
		action.click(driver, sliderTeamReadmore);
		Log.info("click slider team readmore button");
		extentTest.pass("click slider team readmore button");
		return new WorkWithUs();
	}
	
	public Service clickOnSliderOurServicesReadmore() {
		
		action.explicitWait(driver, sliderOurServiceReadmore, 30);
		extentTest.info("click slider our services readmore button");
		
		action.click(driver, sliderOurServiceReadmore);
		Log.info("click slider our services readmore button");
		extentTest.pass("click slider our services readmore button");
		return new Service();
	}
	
	public boolean clickOnSliderDuosasinosReadmore() {
		
		action.explicitWait(driver, sliderDuosasinosReadmore, 10);
		extentTest.info("click slider Duosasinos readmore button");
		
		action.click(driver, sliderDuosasinosReadmore);
		Log.info("click slider Duosasinos readmore button");
		extentTest.pass("click slider Duosasinos readmore button");		
		return action.moveToElement(driver, weare);
	}
	
	public boolean clickOnScrollButton() {
		
		extentTest.info("go to footer");
		action.moveToElement(driver, footer);
		extentTest.pass("go to footer");
		Log.info("go to footer");
		
		action.explicitWait(driver, backToTopButton, 10);
		
		extentTest.info("click on scroll Button");
		action.click(driver, backToTopButton);
		action.moveToElement(driver, footer);
		extentTest.pass("click on scroll Button");
		Log.info("click on scroll Button");
		
		extentTest.info("go to header");
		boolean result = action.moveToElement(driver, header);
		extentTest.pass("go to header");
		Log.info("go to header");
			
		return result;
	}
	
	public String getCurrURL() throws Throwable {
		String URL=action.getCurrentURL(driver);
		return URL;
	}

}
