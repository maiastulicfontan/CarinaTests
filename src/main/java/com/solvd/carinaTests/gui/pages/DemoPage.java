package com.solvd.carinaTests.gui.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.CredentialsBanner;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class DemoPage extends AbstractPage{
	
	@FindBy(xpath="//header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//div[@xpath=1]")
	private Header header;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")
	private NewsletterForm newsletterForm;
	
	@FindBy(xpath="//div[@class='footer-bottom']")
	private Footer footer;
	
	@FindBy(xpath="//div[@class='resource-box']")
	private List<CredentialsBanner> credentialsBanners;
	
	
	public DemoPage(WebDriver driver) {
		super(driver);
	}
	
	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public Alert suscribeToNewsletter(String email) {
		this.newsletterForm.suscribeToNewsletter(email);
		return driver.switchTo().alert();
	}
	
	public Footer getFooter() {
		return footer;
	}
	
	public CredentialsBanner selectCredentialBanner(String title) {
		for (CredentialsBanner cb: credentialsBanners) {
			if (cb.readTitle() == title) {
				return cb;
			}
		}
		return null;
	}

}
