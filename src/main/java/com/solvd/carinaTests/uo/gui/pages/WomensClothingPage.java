package com.solvd.carinaTests.uo.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaTests.uo.gui.components.ClothingItem;

public class WomensClothingPage extends AbstractPage{
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/main/div[3]/div[4]/div[1]/div/div[4]/div[3]/div[5]/div")
	private List<ClothingItem> clothes;
	
	public WomensClothingPage(WebDriver driver) {
		super(driver);
	}
	
	public ClothingInfoPage selectClothingItem (String clothingItemName) {
		for (ClothingItem ci: clothes) {
			if (ci.readName().equalsIgnoreCase(clothingItemName)){
				return ci.openClothingInfoPage();
			}
		}
		return null;
	}
	
}
