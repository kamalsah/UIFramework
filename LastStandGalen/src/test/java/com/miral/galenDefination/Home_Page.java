package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.miral.core.Util;

public class Home_Page extends Util{

	public static Properties CONFIG = null;
	
	  @Test
	public void YasHomePageUIOnDesktop() throws IOException {
		  
		  load(CONFIG.getProperty("siteURL"));
		  //load("https://yasisland.ae/", 1366,768);
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/YasHomepage.spec",asList("Desktop"));
	  }
	 
	  @Test
	public void YasHomePageUIOnMobile() throws IOException {
		  
		  load("https://yasisland.ae/", 412,732);
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/Spec/YasHomepage.spec",asList("mobile"));
	  }
	  
	 @Test
	public void YasHomePageUIOnTablet() throws IOException {
		  
		  load("https://yasisland.ae/", 1024,1366);
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/YasHomepage.spec",asList("tablet"));
	  }
	
}
