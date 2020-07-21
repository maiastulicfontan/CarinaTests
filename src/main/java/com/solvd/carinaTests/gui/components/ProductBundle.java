package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ProductBundle extends AbstractUIObject{
	
	@FindBy(xpath="//h3[@class='js-cross-table__label']")
	private ExtendedWebElement title;
	
	@FindBy(xpath="//p[text()='Standalone web application']")
	private ExtendedWebElement includedFeatures;
	
	@FindBy(xpath="//a[@class='x-ccolor-h']")
	private ExtendedWebElement swType;
	
	
	public ProductBundle(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public ProductBundle(WebDriver driver) {
		super(driver);
	}
	
	public String readTitle() {
		return this.title.getElement().getText();
	}
	
	public String readIncludedFeatures() {
		return this.includedFeatures.getElement().getText();
	}
	
	public String readSwType() {
		return this.swType.getElement().getText();
	}
}
