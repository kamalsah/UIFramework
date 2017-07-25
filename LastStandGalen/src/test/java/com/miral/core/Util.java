package com.miral.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.galenframework.testng.GalenTestNgTestBase;

public class Util extends GalenTestNgTestBase {
	
	
	protected WebDriver driver;
	
	@Override
	public WebDriver createDriver(Object[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")
						+ "//Resource//Tools//Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}

}
