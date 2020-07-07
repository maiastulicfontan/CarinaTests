package com.solvd.carinaTests.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.DiscountCouponAd;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class HomePage extends AbstractPage{
	
	@FindBy(xpath="/html/body/header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="/html/body/div[4]/div[2]")
	private Footer footer;
	
	@FindBy(xpath="/html/body/section/nav")
	private NewsletterForm newsletterForm;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public DiscountCouponAd getDiscountCouponAd() {
		return new DiscountCouponAd(driver);
	}
	
	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}
	
	public NewsletterForm getNewsletterForm() {
		return newsletterForm;
	}
	
	public Footer getFooter() {
		return footer;
	}
}
