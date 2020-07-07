package com.solvd.carinaTests.uo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class UORewardsBanner extends AbstractUIObject{
	@FindBy(xpath= "//*[@id=\"dy-overlay-flyout_custom-close\"]")
	private ExtendedWebElement closeBtn;
	
	public UORewardsBanner(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public UORewardsBanner(WebDriver driver) {
		super(driver);
	}
	
	public void closeRewardsBanner() {
		closeBtn.clickIfPresent();
	}
}
