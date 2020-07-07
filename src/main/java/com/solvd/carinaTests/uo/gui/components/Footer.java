package com.solvd.carinaTests.uo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Footer extends AbstractUIObject{
	
	public Footer (WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public Footer (WebDriver driver) {
		super(driver);
	}
}
