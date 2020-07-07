package com.solvd.carinaTests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carinaTests.gui.pages.HomePage;
import com.solvd.carinaTests.gui.pages.PricingPage;
import com.solvd.carinaTests.gui.pages.PrivacyPolicyPage;
import com.solvd.carinaTests.gui.components.BuyModal;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;

public class WebTest extends AbstractTest{
	

	@Test
	@MethodOwner(owner="Maia")
	public void testHeaderSubtitleOfPrivacyPolicyPage() {
		final String subtitle = "Please take your time and read our terms before order any package.";
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

		homePage.getDiscountCouponAd().closeAdIfPresent();
		
		Footer footer = homePage.getFooter();
		Assert.assertTrue(footer.isUIObjectPresent(2), "Footer wasn't found!");
		
		PrivacyPolicyPage privacyPolicyPage = footer.openPrivacyPolicyPage();
		
		Header header = privacyPolicyPage.getHeader();
		Assert.assertTrue(header.isUIObjectPresent(2), "Header wasn't found!");
		Assert.assertEquals(header.readSubtitle(), subtitle);

	}
	
	
	@Test(description="test interactions with different elements inside a modal")
	@MethodOwner(owner="Maia")
	public void testCheckBoxAndCloseButton () {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		PricingPage pricingPage = homePage.getHeaderMenu().openPricingPage();
		pricingPage.clickSelectBasicBtn();
		
		BuyModal buyModal = pricingPage.getBuyModal();
		//Select qtySelector = buyModal.getQtySelector();
		//qtySelector.selectByValue("2");
		
		buyModal.selectSuscribeCheckbox();
		
		buyModal.closeModal();
		Assert.assertFalse(buyModal.isUIObjectPresent(2), "Buy Modal hasn't closed!");	
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testNewsletterSuscription() {
		final String email = "test@test.com";
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		homePage.getNewsletterForm().suscribeToNewsletter(email);
		pause(5);
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testSelectProductItem() {
		final String itemName = "Tours Module";
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		HeaderMenu headerMenu = homePage.getHeaderMenu();
		Assert.assertTrue(headerMenu.isUIObjectPresent(2), "Header menu wasn't found!");
		
		headerMenu.selectProductItem(itemName);
		pause(5);
	}
}
