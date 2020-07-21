package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class BuyModal extends AbstractUIObject{
	
	@FindBy(xpath="//div[@class='sc-dfVpRl XAZJq']")
	private ExtendedWebElement title;
	
	/*@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[1]/div/select")
	private ExtendedWebElement qtySelector;*/
	
	//Select qtySelector = new Select (driver.findElement(By.xpath("./select")));
	
	@FindBy(xpath="//input[@class='sc-gHboQg cxSpEs']")
	private ExtendedWebElement emailInput;
	
	@FindBy(xpath="//input[@id='marketingConsent']")
	private ExtendedWebElement suscribeCheckbox;
	
	@FindBy(xpath="//span[@class='sc-gqPbQI egsXIH']")
	private ExtendedWebElement totalText;
	
	@FindBy(xpath="//span[@class='sc-hORach bMvUgv']")
	private ExtendedWebElement totalPrice;
	
	@FindBy(xpath="//button[@class='sc-bdVaJa bCVgly']")
	private ExtendedWebElement continueBtn;
	
	@FindBy(xpath="//div[@data-testid='closeButton']")
	private ExtendedWebElement closeBtn;
	
	
	public BuyModal(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public BuyModal(WebDriver driver) {
		super(driver);
	}
	
	/*public Select getQtySelector() {
		return qtySelector;
	}*/
	
	public ExtendedWebElement getSuscribeCheckbox() {
		return suscribeCheckbox;
	}

	public String readTotalPrice() {
		return totalPrice.getElement().getText();
	}
	
	public void closeModal() {
		closeBtn.click();
	}
	
	public void selectSuscribeCheckbox() {
		suscribeCheckbox.click();
	}

}
