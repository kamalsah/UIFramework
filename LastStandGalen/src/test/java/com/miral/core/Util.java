package com.miral.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
		
		
		/*System.setProperty("webdriver.ie.driver",
		System.getProperty("user.dir") + "//Resource//Tools//IEdriver//IEDriverServer.exe");
       
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		ieCapabilities.setCapability("ensureCleanSession", true);
		driver = new InternetExplorerDriver(ieCapabilities);*/
		
		return driver;
	}

}
