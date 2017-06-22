package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class initilizeDriver {
	public static WebDriver driver;
	public static Properties CONFIG = null;
	public static String baseURL;
	public static String browserName;

	public void close() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				driver.quit();
				;

			}
		});
	}

	// method to load config file and initialize CONFIG
	public void loadConfig() {

		if (CONFIG == null) {

			try {
				// initialize OR

				CONFIG = new Properties();

				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir")
								+ "//src//main//resources//Profile//Config.properties");
				CONFIG.load(fs);

			} catch (Exception e) {
				System.out.println("Error on intializing properties files");
				e.printStackTrace();
				System.out.println("nre linr");
				System.out.println(e.getMessage());
			}

		}

	}

	// method to open specific browser
	public void openBrowser(String browserName) {
		
		initilizeDriver.browserName = browserName;

		if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "//tools//Chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			loadConfig();
			baseURL = CONFIG.getProperty("siteURL");
			driver.get(baseURL);

			

		} else if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ "//tools//FirefoxGeckoDriver//geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(driver);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			loadConfig();
			baseURL = CONFIG.getProperty("siteURL");
			driver.get(baseURL);

		
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//tools//IEdriver//IEDriverServer.exe");
           
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability("ensureCleanSession", true);
			driver = new InternetExplorerDriver(ieCapabilities);
			
			//driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			loadConfig();
			baseURL = CONFIG.getProperty("siteURL");
			driver.get(baseURL);
			
		}
		
	}
	
	public void startBatfromInitialize(){
		
		if(browserName.equalsIgnoreCase("Firefox")){
		// code to start firefox report listener
		String[] command = { "cmd.exe", "/C",
				"../bat/generateFirefoxReport.bat" };

		System.out.println("Running firefox bat");
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {

			e.printStackTrace();
		}
		} else if (browserName.equalsIgnoreCase("Chrome")){
			
			// code to start firefox report listener
			String[] command = { "cmd.exe", "/C",
					"../bat/generateChromeReport.bat" };

			System.out.println("Running chrome bat");
			try {
				Runtime.getRuntime().exec(command);
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

	public void tearDown() {

		close();
	}

}
