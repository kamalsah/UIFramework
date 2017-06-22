package galen.LastStandGalen;

import static java.util.Arrays.asList;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.galenframework.testng.GalenTestNgTestBase;

public class SamplePageFF extends GalenTestNgTestBase {
	@Test
	public void YasHomePageUIOnDesktop() throws IOException {
		  
		  load("https://yasisland.ae/", 1366,768);
	      checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/YasHomepage.spec",asList("Desktop"));
	  }
	  @Test
	public void YasHomePageUIOnMobile() throws IOException {
		  
		  load("https://yasisland.ae/", 412,732);
	      checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/YasHomepage.spec",asList("Desktop"));
	  }
	  @Test
	public void YasHomePageUIOnTablet() throws IOException {
		  
		  load("https://yasisland.ae/", 1024,1366);
	      checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/YasHomepage.spec",asList("Desktop"));
	  }

	/*  @Test
	  public void Tablet() throws IOException {
	  	  
	  	  load("http://testapp.galenframework.com", 480, 320);
	        checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/Example.spec",asList("Tablet"));
	  }
	*/
	@Override
	public WebDriver createDriver(Object[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "//Resource//Tools//Geckodriver//geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "//Resource//Tools//Geckodriver//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
*/		
		return new FirefoxDriver();
	}
}
