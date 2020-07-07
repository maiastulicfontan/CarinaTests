package com.solvd.carinaTests.gui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class BuyModal extends AbstractUIObject{
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[2]/div")
	private ExtendedWebElement title;
	
	/*@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[1]/div/select")
	private ExtendedWebElement qtySelector;*/
	
	//Select qtySelector = new Select (driver.findElement(By.xpath("./select")));
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/form/div[1]/div/input")
	private ExtendedWebElement emailInput;
	
	@FindBy(xpath="//*[@id=\"marketingConsent\"]")
	private ExtendedWebElement suscribeCheckbox;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/form/div[3]/div/div/span[1]")
	private ExtendedWebElement totalText;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/form/div[3]/div/div/span[2]/span/var")
	private ExtendedWebElement totalPrice;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/form/button")
	private ExtendedWebElement continueBtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[3]")
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
