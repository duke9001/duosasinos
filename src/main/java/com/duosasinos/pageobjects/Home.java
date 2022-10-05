/**
 * 
 */
package com.duosasinos.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;

/**
 * @author Duke
 *
 */
public class Home extends BaseClass{
	
	Action action = new Action();
	
	@FindBy(linkText = "Read more")
	private WebElement readMore; 
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getReadMore() {			
		return readMore;
	}
	
	public String getCurrURL() throws Throwable {
		String homePageURL=action.getCurrentURL(driver);
		return homePageURL;
	}

}
