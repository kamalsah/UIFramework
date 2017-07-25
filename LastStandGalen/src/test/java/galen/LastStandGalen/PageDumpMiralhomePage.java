package galen.LastStandGalen;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import net.mindengine.galen.api.Galen

import com.galenframework.api.Galen;
import com.miral.core.Util;

public class PageDumpMiralhomePage extends Util {
  @Test
  public void f() {
	  
	  WebDriver driver=getDriver();
	  driver.get("http://localhost:8080/public_html/contact.html");
	 // Galen.dumpPage(driver,System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec",System.getProperty("user.dir")+ "/src/test/resources/PageDump");
	  Galen.dumpPage(driver,"Home Page","D://GalenJAVA/LastStandGalen/src/test/resources/Spec//YasHomepage.spec","D:/GalenJAVA/LastStandGalen/src/test/resources//PageDump",1320,1024);
  
}
