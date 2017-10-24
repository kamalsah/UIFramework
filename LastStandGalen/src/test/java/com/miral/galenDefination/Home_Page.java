package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class Home_Page extends Util{

	public static Properties CONFIG = null;
	 	
	@Test
	public void YasHomePageUIOnDesktop() throws IOException {
			/*WebDriver driver=getDriver();
		  //load(CONFIG.getProperty("siteURL"));
		  load("https://yasisland.ae/", 1366,768);*/
		  WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/", 1366,768);
		WebElement header=driver.findElement(By.xpath(".//div[@class='c-header component']"));
		checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHomePage.spec",asList("Desktop"));
		  /*//new GalenPageDump("some page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomeDesktop"); 
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec",asList("Desktop"));
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasFooter.spec",asList("Desktop"));*/
	  }
	
/*@Test	
	public void YasHomePageUIOnMobile() throws IOException {
		  
		  load("https://yasisland.ae/", 412,732);
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec",asList("mobile"));
	      //new GalenPageDump("some page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomeMobile"); 
	  }
	   
 @Test
	public void YasHomePageUIOnTablet() throws IOException {
	 		WebDriver driver=getDriver();
	 		load("https://yasisland.ae/", 1024,1366);
		  //new GalenPageDump("some page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomeTablet"); 
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec",asList("tablet"));
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasFooter.spec",asList("Desktop"));
	  }
	*/
}
