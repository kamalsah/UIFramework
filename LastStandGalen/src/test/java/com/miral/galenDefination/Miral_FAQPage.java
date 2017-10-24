package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class Miral_FAQPage extends Util {
	
	@Test
	public void Miral_FAQPage_Header_UI_Validation() throws IOException, InterruptedException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/sale-support/faq", 1366,768);
		WebElement login=driver.findElement(By.xpath(".//div[contains(@class,'btn btn-secondary header-bottom-btn-login')]/a"));
		login.click();
		Thread.sleep(10000);
		WebElement email=driver.findElement(By.xpath(".//input[@name='Username or email address']"));
		WebElement password=driver.findElement(By.xpath(".//input[@id='password']"));
		email.sendKeys("msingh121@sapient.com");
		password.sendKeys("Vtsssr8x");
		WebElement loginbtn= driver.findElement(By.xpath(".//button[@id='next']"));
		loginbtn.click();
		Thread.sleep(10000);
			
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
	public void Miral_FAQPage_HeroPanel_UI_Validation() throws IOException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/sale-support/faq", 1366,768);
			
				WebElement heroPanel=driver.findElement(By.xpath(".//div[contains(@class,'hero-panel--content')]"));
			
			if(heroPanel.isDisplayed())
			{
				//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeroPanelWithoutImage.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/FAQPage/HeroPanelwithoutImage");
				checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeroPanelWithoutImage.spec",asList("Desktop"));
				
			}else
			{
				System.out.println("----------------Element not found---------------------------");
			}
			
			
	  }
	
	@Test
	public void Miral_FAQPage_CollapsibleContent_UI_Validation() throws IOException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/sale-support/faq", 1366,768);
			
				WebElement collapsible=driver.findElement(By.xpath(".//div[contains(@class,'component c-collapsible-content')]"));
			
			if(collapsible.isDisplayed())
			{
				//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralCollapsibleContent.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/FAQPage/CollapsibleContent");
				checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralCollapsibleContent.spec",asList("Desktop"));
				
			}else
			{
				System.out.println("----------------Element not found---------------------------");
			}
			
	}
			@Test
			public void Miral_FAQPage_TextWithCTA_UI_Validation() throws IOException {
				WebDriver driver=getDriver();
				load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/sale-support/faq", 1366,768);
					
						WebElement textWithCTA=driver.findElement(By.xpath(".//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]"));
					
					if(textWithCTA.isDisplayed())
					{
						//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralTextwithCTA.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/FAQPage/TextwithCTA");
						checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralTextwithCTA.spec",asList("Desktop"));
						
					}else
					{
						System.out.println("----------------Element not found---------------------------");
					}
			
	  }
			
			@Test
			public void Miral_FAQPage_Footer_UI_Validation() throws IOException
			{
				WebDriver driver=getDriver();
				load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/sale-support/faq", 1366,768);
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
