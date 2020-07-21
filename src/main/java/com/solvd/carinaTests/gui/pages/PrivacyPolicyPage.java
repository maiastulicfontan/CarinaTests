package com.solvd.carinaTests.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class PrivacyPolicyPage extends AbstractPage{
	@FindBy(xpath="//header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//div[@xpath=1]")
	private Header header;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")
	private NewsletterForm newsletterForm;
	
	@FindBy(xpath="//div[@class='footer-bottom']")
	private Footer footer;

	public PrivacyPolicyPage(WebDriver driver) {
		super(driver);
	}
	
	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public NewsletterForm getNewsletterForm() {
		return newsletterForm;
	}
	
	public Footer getFooter() {
		return footer;
	}

}
