package com.solvd.carinaTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carinaTests.uo.gui.components.ClothingItem;
import com.solvd.carinaTests.uo.gui.components.HeaderMenu;
import com.solvd.carinaTests.uo.gui.components.TopBanner;
import com.solvd.carinaTests.uo.gui.pages.ClothingInfoPage;
import com.solvd.carinaTests.uo.gui.pages.HomePage;
import com.solvd.carinaTests.uo.gui.pages.WomensClothingPage;

public class UOWebTest extends AbstractTest {
	private static final Logger LOGGER = LogManager.getLogger(UOWebTest.class);
	
	@Test
	@MethodOwner(owner="Maia")
	public void testSelectClothingItem () {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		HeaderMenu headerMenu = homePage.getHeaderMenu();
		Assert.assertTrue(headerMenu.isUIObjectPresent(2), "Header menu wasn't found!");
		
		WomensClothingPage womensClothingPage = headerMenu.openWomensClothingPage();
		
		ClothingInfoPage clothingInfoPage = womensClothingPage.selectClothingItem("UO Emma Cupro Smoked Cami");
		Assert.assertTrue(clothingInfoPage.isPageOpened(), "Clothing info page is not opened");
	}
	
	@Test
	@MethodOwner(owner="Maia")
	public void testTopBannerNextTitle() {
		final String title = "To our UO Community: You deserve better, and we commit to doing better.";
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		
		TopBanner topBanner = homePage.getTopBanner();
		topBanner.showNextTitle();
		Assert.assertEquals(topBanner.readTitle(), title);
	}
}
