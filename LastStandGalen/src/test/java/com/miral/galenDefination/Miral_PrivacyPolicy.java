package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class Miral_PrivacyPolicy extends Util{
	public static Properties CONFIG = null;
	
/*	@BeforeTest
	public void Test_Init()
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/b2b/home", 1366,768);
		
	}
	*/
	@Test
	public void Miral_PrivacyPolicy_Header_UI_Validation() throws IOException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/en/about-farah/privacy-policy", 1366,768);
			
				WebElement header=driver.findElement(By.xpath(".//div[@class='c-header component']"));
			
			if(header.isDisplayed())
			{
				//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeader.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/Header");
				checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeader.spec",asList("Desktop"));
				
			}else
			{
				System.out.println("----------------Element not found---------------------------");
			}
			
			
	  }

	@Test
	public void Miral_PrivacyPolicy_EditorialText_UI_Validation() throws IOException, InterruptedException
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/en/about-farah/privacy-policy", 1366,768);
		Thread.sleep(10000);
		WebElement editorialText=driver.findElement(By.xpath(".//div[contains(@class,'component c-editorial-text')]"));
		new Actions(driver).moveToElement(editorialText).perform();
		if(editorialText.isDisplayed())
		{
			new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialText.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/PrivacyPolicy/EditorialText");
			//checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeroPanel.spec",asList("Desktop"));
			
		}else
		{
			System.out.println("----------------Element not found---------------------------");
		}
		
	}
	
	@Test
	public void Miral_PrivacyPolicy_EditorialList_UI_Validation() throws IOException
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/en/about-farah/privacy-policy", 1366,768);
		WebElement editorialList=driver.findElement(By.xpath(".//div[contains(@class,'component c-editorial-list')]"));
		new Actions(driver).moveToElement(editorialList).perform();
		if(editorialList.isDisplayed())
		{
			new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialList.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/PrivacyPolicy/EditorialList");
			//checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialGrid.spec",asList("Desktop"));
			
		}else
		{
			System.out.println("----------------Element not found---------------------------");
		}
	}
		@Test
		public void Miral_PrivacyPolicy_TextwithCTA_UI_Validation() throws IOException
		{
			WebDriver driver=getDriver();
			load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/en/about-farah/privacy-policy", 1366,768);
			WebElement TextwithCTA=driver.findElement(By.xpath(".//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]"));
			new Actions(driver).moveToElement(TextwithCTA).perform();
			if(TextwithCTA.isDisplayed())
			{
				//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialGrid.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/EditorialGrid");
				checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralTextwithCTA.spec",asList("Desktop"));
				
			}else
			{
				System.out.println("----------------Element not found---------------------------");
			}
			
	  
	}
	@Test
	public void Miral_PrivacyPolicy_Footer_UI_Validation() throws IOException
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/en/about-farah/privacy-policy", 1366,768);
		WebElement footer=driver.findElement(By.xpath(".//div[contains(@class,'footer-container component')]"));
		new Actions(driver).moveToElement(footer).perform();
		if(footer.isDisplayed())
		{
			//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralFooter.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/Footer");
			checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralFooter.spec",asList("Desktop"));
			
		}else
		{
			System.out.println("----------------Element not found---------------------------");
		}
		
		
		
		
		//load(CONFIG.getProperty("siteURL"));
	 // load("https://fe-newdev-ux-scep-8d56-cm.azurewebsites.net/B2B/Home/", 1366,768);
	 // new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeader.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomeDesktop"); 
     // checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec",asList("Desktop"));
     // JavascriptExecutor jse = (JavascriptExecutor)driver;
	 // jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  //checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeader.spec",asList("Desktop"));
	  
	}
	}
