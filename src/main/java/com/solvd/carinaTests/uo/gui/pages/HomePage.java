package com.solvd.carinaTests.uo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.uo.gui.components.Footer;
import com.solvd.carinaTests.uo.gui.components.HeaderMenu;
import com.solvd.carinaTests.uo.gui.components.TopBanner;


public class HomePage extends AbstractPage {
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/footer")
	private Footer footer;
	
	@FindBy(xpath="//*[@id=\"dy-exp-banners\"]/div/div[2]/div")
	private TopBanner topBanner;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/header/div[2]/div/div[4]/ul")
	private HeaderMenu headerMenu;
	
	public HomePage (WebDriver driver) {
		super(driver);
	}
	
	
	public Footer getFooter() {
		return footer;
	}
	
	public TopBanner getTopBanner () {
		return topBanner;
	}
	
	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}

}
