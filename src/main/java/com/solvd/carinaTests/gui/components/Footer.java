package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.gui.pages.PrivacyPolicyPage;
import com.solvd.carinaTests.gui.pages.TermsOfServicePage;

public class Footer extends AbstractUIObject{
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/p")
	private ExtendedWebElement copyrightInfo;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/span")
	private ExtendedWebElement slogan;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[1]/ul[1]/li[1]/a")
	private ExtendedWebElement termsOfServiceLink;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[1]/ul[1]/li[2]/a")
	private ExtendedWebElement privacyPolicyLink;
	
	public Footer(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public Footer(WebDriver driver) {
		super(driver);
	}
	
	public String readCopyrightInfo() {
		return copyrightInfo.getElement().getText();
	}
	
	public String readSlogan() {
		return slogan.getElement().getText();
	}
	
	public TermsOfServicePage openTermsOfServicePage() {
		termsOfServiceLink.click();
		return new TermsOfServicePage(driver);
	}
	
	public PrivacyPolicyPage openPrivacyPolicyPage() {
		privacyPolicyLink.click();
		return new PrivacyPolicyPage(driver);
	}

}
