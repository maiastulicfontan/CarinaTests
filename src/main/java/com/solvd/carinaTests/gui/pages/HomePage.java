package com.solvd.carinaTests.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.DiscountCouponAd;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class HomePage extends AbstractPage{
	
	@FindBy(xpath="//header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//div[@class='footer-bottom']")
	private Footer footer;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")
	private NewsletterForm newsletterForm;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public DiscountCouponAd getDiscountCouponAd() {
		return new DiscountCouponAd(driver);
	}

	public PricingPage openPricingPage() {
		return this.headerMenu.openPricingPage();
	}
	
	public DemoPage openDemoPage() {
		return this.headerMenu.openDemoPage();
	}
	
	
	public NewsletterForm getNewsletterForm() {
		return newsletterForm;
	}
	
	public Footer getFooter() {
		return footer;
	}
}
