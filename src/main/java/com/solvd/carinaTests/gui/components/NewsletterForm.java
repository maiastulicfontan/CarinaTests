package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class NewsletterForm extends AbstractUIObject{
	
	@FindBy(xpath="//*[@id=\"address\"]")
	private ExtendedWebElement input;
	
	@FindBy(xpath="//*[@id=\"email\"]/button")
	private ExtendedWebElement suscribeBtn;
	
	public NewsletterForm(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public NewsletterForm(WebDriver driver) {
		super(driver);
	}
	
	public void suscribeToNewsletter (String email) {
		input.type(email);
		suscribeBtn.click();
	}

}
