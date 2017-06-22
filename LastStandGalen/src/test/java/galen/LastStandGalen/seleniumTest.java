package galen.LastStandGalen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

	public static void main(String arg[])
	{
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://yasisland.ae/");
		driver.findElement(By.xpath("//div/h1"));
		System.out.println("sucessfull");
		driver.close();
		
	}
	
	
}
