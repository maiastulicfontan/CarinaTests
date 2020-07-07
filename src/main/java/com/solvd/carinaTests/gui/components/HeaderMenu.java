package com.solvd.carinaTests.gui.components;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.gui.pages.DemoPage;
import com.solvd.carinaTests.gui.pages.HomePage;
import com.solvd.carinaTests.gui.pages.PricingPage;

public class HeaderMenu extends AbstractUIObject{
	
	@FindBy(xpath="/html/body/header/div/a")
	private ExtendedWebElement logoLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[2]/a")
	private ExtendedWebElement demoLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[3]/a")
	private ExtendedWebElement pricingLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[4]/button")
	private ExtendedWebElement productLink;
	
	@FindBy(xpath="//div[contains(@class, 'yx-njb')]//a")
	private List<ExtendedWebElement> productItems;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[6]/button")
	private ExtendedWebElement hostingLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[7]/button")
	private ExtendedWebElement supportLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[8]/button")
	private ExtendedWebElement linksLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[10]/a")
	private ExtendedWebElement docsLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[11]/a")
	private ExtendedWebElement blogLink;
	
	@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[2]/li/a")
	private ExtendedWebElement loginLink;
	
	public HeaderMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public HeaderMenu(WebDriver driver) {
		super(driver);
	}
	
	public HomePage openHomePage () {
		logoLink.click();
		return new HomePage(driver);
	}
	
	public DemoPage openDemoPage() {
		demoLink.click();
		return new DemoPage(driver);
	}
	
	public PricingPage openPricingPage() {
		pricingLink.click();
		return new PricingPage(driver);
	}
	
	public void selectProductItem(String itemName) {
		productLink.click();
		System.out.println(productItems);
		for (ExtendedWebElement productItem: productItems) {
			String currentItem = productItem.getElement().getText();
			if (itemName.equalsIgnoreCase(currentItem)) {
				productItem.click();
			}
		}
	}
}
