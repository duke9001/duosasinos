/**
 * 
 */
package com.duosasinos.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;

/**
 * @author Duke
 *
 */
public class Outsource extends BaseClass{

	private Action action = new Action();

	public Outsource() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrURL() throws Throwable {
		String outsourcePageURL=action.getCurrentURL(driver); 
		return outsourcePageURL; 
	}

}
