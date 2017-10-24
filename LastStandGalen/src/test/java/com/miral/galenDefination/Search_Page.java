package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class Search_Page extends Util {
	
  @Test
  public void YasSearchpageUIinDesktop() throws IOException {
	  
	  WebDriver driver=getDriver();
	  load("https://yasisland.ae/", 1366,1024);
	  WebElement searchicon=driver.findElement(By.xpath("//li[contains(@class,'uk-visible-large')]/a"));
	  searchicon.click();
	 // new GalenPageDump("Search Desktop page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump"); 
      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasSearch.spec",asList("Desktop")); 
      
  }
  
  
  @Test
  public void YasSearchpageUIinTablet() throws IOException {
	  WebDriver driver=getDriver();
	  load("https://yasisland.ae/", 1366,768);
	  WebElement searchicon=driver.findElement(By.xpath("//li[contains(@class,'uk-hidden-large')]/a"));
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  searchicon.click();
	  //new GalenPageDump("Search Tablet page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump"); 
      checkLayout(System.getProperty("user.dir")+ "/src/test/resources//spec/YasSearch.spec",asList("tablet"));  
  }
  
  
  @Test
  public void YasSearchpageUIinMobile() throws IOException {
	  WebDriver driver=getDriver();
	  load("https://yasisland.ae/", 412,732);
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	  WebElement searchicon=driver.findElement(By.xpath("//li[contains(@class,'uk-visible-large')]/a"));
	  searchicon.click();
	  //new GalenPageDump("Search Mobile page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump"); 
      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasSearch.spec",asList("mobile"));
  }
	  
  
}
