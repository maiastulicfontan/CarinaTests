package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class DiscountCouponAd extends AbstractUIObject{
	
	@FindBy(xpath="/html/body/div[5]/button")
	private ExtendedWebElement closeBtn;
	
	public DiscountCouponAd(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public DiscountCouponAd(WebDriver driver) {
		super(driver);
	}
	
	public void closeAdIfPresent() {
		closeBtn.clickIfPresent();
	}

}
