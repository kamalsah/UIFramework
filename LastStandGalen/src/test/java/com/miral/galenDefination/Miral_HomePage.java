package com.miral.galenDefination;

import static java.util.Arrays.asList;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.entity.mime.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class Miral_HomePage extends Util {
	
	public static Properties CONFIG = null;
	
/*	@BeforeTest
	public void Test_Init()
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/b2b/home", 1366,768);
		
	}
	*/
	@Test
	public void Miral_HomePage_Header_UI_Validation() throws IOException, InterruptedException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/", 1366,768);
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
	public void Miral_HomePage_HeroPanel_UI_Validation() throws IOException, InterruptedException
	{
		WebDriver driver=getDriver();
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
	
		Thread.sleep(10000);
		WebElement heropanel=driver.findElement(By.xpath(".//div[contains(@class,'hero-panel component')]"));
		new Actions(driver).moveToElement(heropanel).perform();
		if(heropanel.isDisplayed())
		{
			//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeroPanel.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/HeroPanel");
			checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeroPanel.spec",asList("Desktop"));
			
		}else
		{
			System.out.println("----------------Element not found---------------------------");
		}
		
	}
	
	@Test
	public void Miral_HomePage_EditorialGrid_UI_Validation() throws IOException, InterruptedException
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/", 1366,768);
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
	
		WebElement editorialGrid=driver.findElement(By.xpath(".//div[contains(@class,'component c-editorial-grid')]"));
		new Actions(driver).moveToElement(editorialGrid).perform();
		if(editorialGrid.isDisplayed())
		{
			//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialGrid.spec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/EditorialGrid");
			checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralEditorialGrid.spec",asList("Desktop"));
			
		}else
		{
			System.out.println("----------------Element not found---------------------------");
		}

	  
	}
	@Test
	public void Miral_HomePage_Footer_UI_Validation() throws IOException, InterruptedException
	{
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/", 1366,768);
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
	
 
	/*@Test
	public void Miral_HomePage_Header_Mobile_UI_Validation() throws IOException, InterruptedException {
		WebDriver driver=getDriver();
		load("http://fe-qa-ux-scxp-8a49-cd.azurewebsites.net/",480,640);
		WebElement login=driver.findElement(By.xpath(".//div[contains(@class,'btn btn-secondary header-bottom-btn-login')]/a"));
		login.click();
		Thread.sleep(10000);
		WebElement email=driver.findElement(By.xpath(".//input[@name='Username or email address']"));
		WebElement password=driver.findElement(By.xpath(".//input[@id='password']"));
		email.sendKeys("msingh121@sapient.com");
		password.sendKeys("Vtsssr8x");
		WebElement header=driver.findElement(By.xpath(".//div[@class='c-header component']"));
	
			
				WebElement hamburger=driver.findElement(By.xpath(".//div[contains(@class,'c-header component')]/descendant::div[contains(@class,'c-header-top-icon hamburger')]"));
				//Thread.sleep(3000);
				//WebElement sublink=driver.findElement(By.xpath(".//a[contains(@class,'link') and contains(text(),'THEME PARKS')]"));
			if(hamburger.isDisplayed())
			{
				hamburger.click();
				//Thread.sleep(30000);
				//sublink.click();
				//new GalenPageDump("Home page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeaderMobile.gspec", System.getProperty("user.dir")+ "/src/test/resources/PageDump/HomePage/Header_Mobile");
				checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/MiralHeaderMobile.gspec",asList("Mobile"));
				
			}else
			{
				System.out.println("----------------Element not found---------------------------");
			}
			
			
	  }*/

}
