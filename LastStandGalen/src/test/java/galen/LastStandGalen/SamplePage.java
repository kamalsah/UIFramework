package galen.LastStandGalen;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static java.util.Arrays.asList;

import java.io.IOException;

import com.galenframework.testng.GalenTestNgTestBase;

public class SamplePage extends GalenTestNgTestBase{
	
	
	/*@Test
  public void Desktop() throws IOException {
	  
	  load("https://www.motiva.com/", 1024, 768);
      checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/MotiveHomepage.spec",asList("Desktop"));
  }*/
	
  @Test
public void YasHomePageUIOnDesktop() throws IOException {
	  
	  load("https://yasisland.ae/", 1366,768);
      //checkLayout("D://GalenJAVA/LastStandGalen/src/test/java/Spec/YasHomepage.spec",asList("Desktop"))
      checkLayout("user.dir" + "/YasHomepage.spec",asList("Desktop"));

  }
 
  @Test
public void YasHomePageUIOnMobile() throws IOException {
	  
	  load("https://yasisland.ae/", 412,732);
      checkLayout("user.dir" + "/YasHomepage.spec",asList("Desktop"));
  }
  
 @Test
public void YasHomePageUIOnTablet() throws IOException {
	  
	  load("https://yasisland.ae/", 1024,1366);
      checkLayout("user.dir" + "/YasHomepage.spec",asList("Desktop"));
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
	
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")
					+ "//Resource//Tools//Chromedriver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	return driver;
}
}
