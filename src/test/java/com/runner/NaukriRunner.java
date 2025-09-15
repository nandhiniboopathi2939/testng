package com.runner;



import org.testng.annotations.Listeners;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;


//@Listeners(ITestListnerClass.class)

public class NaukriRunner extends BaseClass {


	public static void main(String[] args) {
		
		
		browserLaunch(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		urlLaunch(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
		PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
		
		
	}
	
	
}
