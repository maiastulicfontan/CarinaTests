package com.solvd.carinaTests.uo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carinaTests.uo.gui.pages.ClothingInfoPage;

public class ClothingItem extends AbstractUIObject {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/main/div[3]/div[4]/div[1]/div/div[4]/div[3]/div[1]/div/div[1]/a/p")
	public ExtendedWebElement nameLink;
	
	public ClothingItem (WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public ClothingItem (WebDriver driver) {
		super(driver);
	}
	
	public String readName() {
		return nameLink.getElement().getText();
	}
	
	public ClothingInfoPage openClothingInfoPage() {
		nameLink.click();
		return new ClothingInfoPage(driver);
	}
}
