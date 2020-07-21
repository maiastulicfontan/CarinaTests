package com.solvd.carinaTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carinaTests.gui.pages.DemoPage;
import com.solvd.carinaTests.gui.pages.HomePage;
import com.solvd.carinaTests.gui.pages.PricingPage;
import com.solvd.carinaTests.gui.pages.PrivacyPolicyPage;
import com.solvd.carinaTests.gui.components.BuyModal;
import com.solvd.carinaTests.gui.components.CredentialsBanner;
import com.solvd.carinaTests.gui.components.Footer;
import com.solvd.carinaTests.gui.components.Header;
import com.solvd.carinaTests.gui.components.HeaderMenu;
import com.solvd.carinaTests.gui.components.ProductBundle;

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
		
		homePage.getDiscountCouponAd().closeAdIfPresent();
		
		PricingPage pricingPage = homePage.openPricingPage();
		pricingPage.clickSelectBasicBtn();
		
		BuyModal buyModal = pricingPage.getBuyModal();
		//Select qtySelector = buyModal.getQtySelector();
		//qtySelector.selectByValue("2");
		
		
		buyModal.selectSuscribeCheckbox();
		Assert.assertTrue(buyModal.getSuscribeCheckbox().isChecked());
		
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
		
		DemoPage demoPage = homePage.openDemoPage();
		
		Alert alert = demoPage.suscribeToNewsletter(email);
		Assert.assertTrue(alert.getText() == "Successfully Subscribe.");
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testSelectProductItem() {
		final String itemName = "Hotels Module";
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		//HeaderMenu headerMenu = homePage.getHeaderMenu();
		//Assert.assertTrue(headerMenu.isUIObjectPresent(2), "Header menu wasn't found!");
		
		//headerMenu.selectProductItem(itemName);
	}
	
	@Test(dataProvider="SingleDataProvider")
	@XlsDataSourceParameters(path="xls/pricing.xlsx", sheet="PHPTravels", dsUid="TUID", dsArgs="title, included_features, sw_type")
	@MethodOwner(owner="Maia")
	public void testPricingDetails(String title, String included_features, String sw_type) {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		PricingPage pricingPage = homePage.openPricingPage();
		
		ProductBundle productBundle = pricingPage.selectProductBundle(title);
		
		Assert.assertEquals(productBundle.readIncludedFeatures(), included_features, "Invalid included features information");
		Assert.assertEquals(productBundle.readSwType(), sw_type, "Invalid software type information");
	}
	
	@DataProvider(parallel= false, name ="DP")
	public static Object[][] dataProvider(){
		return new Object[][] {
			{"TUID: dp1", "Homepage", "Front-End"},
			{"TUID: dp2", "Administrator", "Back-End"}
		};
	}
	
	@Test (dataProvider="DP")
	@MethodOwner(owner="Maia")
	public void testDemoCredentialsInfo(String TUID, String title, String description) {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		DemoPage demoPage = homePage.openDemoPage();
		
		CredentialsBanner credentialsBanner = demoPage.selectCredentialBanner(title);
		Assert.assertTrue(credentialsBanner.readDescription()== description);
	}
}
