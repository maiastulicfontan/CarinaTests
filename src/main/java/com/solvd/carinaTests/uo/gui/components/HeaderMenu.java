package com.solvd.carinaTests.uo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.uo.gui.pages.WomensClothingPage;

public class HeaderMenu extends AbstractUIObject {
	
	@FindBy(linkText="Women's")
	private ExtendedWebElement womensLink;
	
	@FindBy(linkText="Men's")
	private ExtendedWebElement mensLink;
	
	@FindBy(linkText="Home")
	private ExtendedWebElement homeLink;
	
	@FindBy(linkText="Lifestyle")
	private ExtendedWebElement lifestyleLink;
	
	@FindBy(linkText="Beauty")
	private ExtendedWebElement beautyLink;
	
	@FindBy(linkText="Sale")
	private ExtendedWebElement saleLink;
	
	public HeaderMenu (WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public HeaderMenu(WebDriver driver) {
		super(driver);
	}
	
	public WomensClothingPage openWomensClothingPage() {
		womensLink.click();
		return new WomensClothingPage(driver);
	}
}
