package com.solvd.carinaTests.uo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.uo.gui.pages.CovidInfoPage;

public class TopBanner extends AbstractUIObject{
	@FindBy(xpath="//*[@id=\"dy-exp-banners\"]/div/div[1]/div/p[2]")
	private ExtendedWebElement title;
	
	@FindBy(linkText="Read More")
	private ExtendedWebElement readMoreLink;
	
	@FindBy(xpath="//*[@id=\"dy-exp-banners\"]/button[2]")
	private ExtendedWebElement previousBtn;
	
	@FindBy(xpath="//*[@id=\"dy-exp-banners\"]/button[1]")
	private ExtendedWebElement nextBtn;
	
	public TopBanner(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public TopBanner(WebDriver driver) {
		super(driver);
	}
	
	public String readTitle() {
		return title.getElement().getText();
	}
	
	public void showPreviousTitle() {
		previousBtn.click();
	}
	
	public void showNextTitle() {
		nextBtn.click();
	}
	
	public CovidInfoPage openCovidInfoPage() {
		readMoreLink.click();
		return new CovidInfoPage(driver);
	}
}
