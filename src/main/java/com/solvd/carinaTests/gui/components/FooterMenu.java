package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.gui.pages.DesktopAppPage;
import com.solvd.carinaTests.gui.pages.FeaturesPage;

public class FooterMenu extends AbstractUIObject{
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div[2]/div[1]/ul/li[1]/a")
	private ExtendedWebElement desktopAppLink;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div[2]/div[1]/ul/li[3]/a")
	private ExtendedWebElement featuresLink;
	
	public FooterMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public FooterMenu(WebDriver driver) {
		super(driver);
	}
	
	public DesktopAppPage openDesktopAppPage() {
		desktopAppLink.click();
		return new DesktopAppPage(driver);
	}
	
	public FeaturesPage openFeaturesPage() {
		featuresLink.click();
		return new FeaturesPage(driver);
	}
}
