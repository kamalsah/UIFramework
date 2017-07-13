package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.miral.core.Util;

public class ContactUs_Page extends Util {
	public static Properties CONFIG = null;
	@Test
	  public void YasContactUsUIinDesktop() throws IOException {
		  
		  WebDriver driver=getDriver();
		  load("https://yasisland.ae/", 1366,768);
		  WebElement linkContactUs=driver.findElement(By.xpath(".//*[@id='menu-footer-navigation-1']/li/a[@title='Contact Us']"));
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  linkContactUs.click();
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/ContactUs.spec",asList("Desktop")); 
	  }
	  
	  
/*	  @Test
	  public void YasContactUsUIinTablet() throws IOException {
		  WebDriver driver=getDriver();
		  load("https://yasisland.ae/", 1366,768);
		  WebElement linkContactUs=driver.findElement(By.xpath(".//*[@id='menu-footer-navigation-1']/li/a[@title='Contact Us']"));
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  linkContactUs.click();
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/ContactUs.spec",asList("tablet"));  
	  }
	  
	  
	  @Test
	  public void YasContactUsUIinMobile() throws IOException {
		  WebDriver driver=getDriver();
		  load("https://yasisland.ae/", 412,732);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		  WebElement linkContactUs=driver.findElement(By.xpath(".//*[@id='menu-footer-navigation-1']/li/a[@title='Contact Us']"));
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  linkContactUs.click();
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/ContactUs.spec",asList("mobile"));
	  }
		  */
}
