/**
 * 
 */
package com.duosasinos.pageobjects;

import com.duosasinos.actiondriver.Action;
import com.duosasinos.base.BaseClass;

/**
 * @author Duke
 *
 */
public class WorkWithUs extends BaseClass {
	private Action action = new Action();

	public String getCurrURL() throws Throwable {
		String URL=action.getCurrentURL(driver);
		return URL;
	}
}
