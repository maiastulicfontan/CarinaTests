package com.solvd.carinaTests.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.FooterMenu;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class FeaturesPage extends AbstractPage{
	@FindBy(xpath="//header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//div[@xpath=1]")
	private Header header;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")
	private NewsletterForm newsletterForm;
	
	@FindBy(xpath="//div[@class='footer-top']")
	private FooterMenu footerMenu;
	
	@FindBy(xpath="//div[@class='footer-bottom']")
	private Footer footer;
	
	public FeaturesPage(WebDriver driver) {
		super(driver);
	}

	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}

	public void setHeaderMenu(HeaderMenu headerMenu) {
		this.headerMenu = headerMenu;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public NewsletterForm getNewsletterForm() {
		return newsletterForm;
	}

	public void setNewsletterForm(NewsletterForm newsletterForm) {
		this.newsletterForm = newsletterForm;
	}

	public FooterMenu getFooterMenu() {
		return footerMenu;
	}

	public void setFooterMenu(FooterMenu footerMenu) {
		this.footerMenu = footerMenu;
	}

	public Footer getFooter() {
		return footer;
	}

	public void setFooter(Footer footer) {
		this.footer = footer;
	}

}
