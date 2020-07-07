package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.gui.pages.DemoPage;
import com.solvd.carinaTests.gui.pages.PricingPage;

public class Header extends AbstractUIObject{
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[1]/div/h2")
	private ExtendedWebElement title;
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[1]/div/p")
	private ExtendedWebElement subtitle;
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div[1]/a")
	private ExtendedWebElement checkPricingBtn;
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div[2]/a")
	private ExtendedWebElement exploreDemoBtn;
	
	public Header(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public Header(WebDriver driver) {
		super(driver);
	}
	
	public String readTitle() {
		return title.getElement().getText();
	}
	
	public String readSubtitle() {
		return subtitle.getElement().getText();
	}
	
	public PricingPage openPricingPage() {
		checkPricingBtn.click();
		return new PricingPage(driver);
	}
	
	public DemoPage openDemoPage() {
		exploreDemoBtn.click();
		return new DemoPage(driver);
	}

}
