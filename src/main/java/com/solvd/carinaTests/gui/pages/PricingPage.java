package com.solvd.carinaTests.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.gui.components.BuyModal;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.NewsletterForm;
import com.solvd.carinaTests.gui.components.ProductBundle;

public class PricingPage extends AbstractPage{
	
	@FindBy(xpath="//header")
	private HeaderMenu headerMenu;
	
	@FindBy(xpath="//div[@xpath=1]")
	private Header header;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")
	private NewsletterForm newsletterForm;
	
	@FindBy(xpath="//div[@class='footer-bottom']")
	private Footer footer;
	
	@FindBy(xpath="//*[@id=\"pf_582434\"]")
	private BuyModal buyModal;
	
	@FindBy(xpath="//tr[@class='x-nsi']/th[2]/div/p[2]/a")
	private ExtendedWebElement selectBasicBtn;
	
	@FindBy(xpath="//tr[@class='x-nsi']/th[3]/div/p[2]/a")
	private ExtendedWebElement selectProBtn;
	
	@FindBy(xpath="//tr[@class='x-nsi']/th[4]/div/p[2]/a")
	private ExtendedWebElement selectEnterpriseBtn;
	
	@FindBy(xpath="//th[@class='x-nss x-pr']")
	private List<ProductBundle> productBundles;
	
	//private Enum 
	
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
	
	//change lists to enums
	public ProductBundle selectProductBundle(String bundleName) {
		for (ProductBundle pb: productBundles ) {
			if (pb.readTitle() == bundleName) {
				return pb;
			}
		}
		return null;
	}

}
