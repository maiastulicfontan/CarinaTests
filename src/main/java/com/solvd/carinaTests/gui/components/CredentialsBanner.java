package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class CredentialsBanner extends AbstractUIObject {
	
	@FindBy(xpath="//div[@class='resource-info']//strong")
	private ExtendedWebElement title;
	
	@FindBy(xpath="//div[@class='resource-info']//span[@class='name']")
	private ExtendedWebElement description;
	
	
	public CredentialsBanner(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public CredentialsBanner(WebDriver driver) {
		super(driver);
	}
	
	public String readTitle() {
		return this.title.getElement().getText();
	}
	
	public String readDescription() {
		return this.description.getElement().getText();
	}
}
