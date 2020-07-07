package com.solvd.carinaTests.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.BuyModal;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;

public class PricingPage extends AbstractPage{
	
	@FindBy(xpath="/html/body/header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div")
	private Header header;
	
	@FindBy(xpath="/html/body/section/nav")
	private NewsletterForm newsletterForm;
	
	@FindBy(xpath="/html/body/div[4]/div[2]")
	private Footer footer;
	
	@FindBy(xpath="//*[@id=\"pf_582434\"]")
	private BuyModal buyModal;
	
	@FindBy(xpath="//*[@id=\"Main\"]/div/div[3]/table/thead/tr/th[2]/div/p[2]/a")
	private ExtendedWebElement selectBasicBtn;
	
	@FindBy(xpath="//*[@id=\"Main\"]/div/div[3]/table/thead/tr/th[3]/div/p[2]/a")
	private ExtendedWebElement selectProBtn;
	
	@FindBy(xpath="//*[@id=\"Main\"]/div/div[3]/table/thead/tr/th[4]/div/p[2]/a")
	private ExtendedWebElement selectEnterpriseBtn;
	
	public PricingPage(WebDriver driver) {
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
	
	public BuyModal getBuyModal() {
		return buyModal;
	}
	
	public void clickSelectBasicBtn() {
		selectBasicBtn.click();
		driver.switchTo().frame("pf_582434");
		
	}

}
