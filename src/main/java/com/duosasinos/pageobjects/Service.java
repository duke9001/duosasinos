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
public class Service extends BaseClass {

	private Action action = new Action();
	
	@FindBy(xpath = "//div[@class='elementor-widget-container']//child::a")
	private WebElement softwareDevelopmentReadmoreButton; 
	
	@FindBy(xpath = "//section[@data-id='5e14c34']//div[@class='elementor-widget-container']//child::a")
	private WebElement researchAndAlgorithmReadmoreButton; 
	
	@FindBy(xpath = "//section[@data-id='362465a']//div[@class='elementor-widget-container']//child::a")
	private WebElement legacySoftwareReadmoreButton; 
	
	@FindBy(xpath = "//section[@data-id='5ac428e']//div[@class='elementor-widget-container']//child::a")
	private WebElement qualityAssuranceReadmoreButton; 
	
	@FindBy(xpath = "//section[@data-id='2cb8c2a']//div[@class='elementor-widget-container']//child::a")
	private WebElement printDesignReadmoreButton; 
	
	@FindBy(xpath = "//section[@data-id='4a63151']//div[@class='elementor-widget-container']//child::a")
	private WebElement visualDesignReadmoreButton; 
	
	public Service() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCurrURL() throws Throwable {
		String URL=action.getCurrentURL(driver);
		return URL;
	}
	
	public SoftwareDevelopment clickOnSoftwareDevelopmentReadmoreButton() {
		action.explicitWait(driver, softwareDevelopmentReadmoreButton, 5);
		extentTest.info("click software development readmore button");
		
		action.click(driver, softwareDevelopmentReadmoreButton);
		Log.info("click software development readmore button");
		extentTest.pass("click software development readmore button");
		return new SoftwareDevelopment();
	}
	
	public ResearchWorkAndIntelligentAlgorithms clickOnResearchAndAlgorithmReadmoreButton() {
		action.explicitWait(driver, researchAndAlgorithmReadmoreButton, 5);
		extentTest.info("click research and algorithm readmore button");
		
		action.click(driver, researchAndAlgorithmReadmoreButton);
		Log.info("click research and algorithm readmore button");
		extentTest.pass("click research and algorithm readmore button");
		return new ResearchWorkAndIntelligentAlgorithms();
	}
	
	public Legacysoftware clickOnLegacySoftwareReadmoreButtonReadmoreButton() {
		action.explicitWait(driver, legacySoftwareReadmoreButton, 5);
		extentTest.info("click legacy software readmore button");
		
		action.click(driver, legacySoftwareReadmoreButton);
		Log.info("click legacy software readmore button");
		extentTest.pass("click legacy software readmore button");
		return new Legacysoftware();
	}
	
	public QualityAssurance clickOnQualityAssuranceReadmoreButton() {
		action.explicitWait(driver, qualityAssuranceReadmoreButton, 5);
		extentTest.info("click quality assurance readmore button");
		
		action.click(driver, qualityAssuranceReadmoreButton);
		Log.info("click quality assurance readmore button");
		extentTest.pass("click quality assurance readmore button");
		return new QualityAssurance();
	}
	
	public PrintDesign clickOnPrintDesignReadmoreButton() {
		action.explicitWait(driver, printDesignReadmoreButton, 5);
		extentTest.info("click print design readmore button");
		
		action.click(driver, printDesignReadmoreButton);
		Log.info("click print design readmore button");
		extentTest.pass("click print design readmore button");
		return new PrintDesign();
	}
	
	public VisualDesign clickOnVisualDesignReadmoreButton() {
		action.explicitWait(driver, visualDesignReadmoreButton, 5);
		extentTest.info("click visual design readmore button");
		
		action.click(driver, visualDesignReadmoreButton);
		Log.info("click visual design readmore button");
		extentTest.pass("click visual design readmore button");
		return new VisualDesign();
	}
}
