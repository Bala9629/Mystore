package browserlaunch;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	static Logger l = Logger.getLogger(Browsers.class); 
	public static WebDriver driver;

	@Test
	@Parameters("Name")
	public static void browsers_name(String name) {
		PropertyConfigurator.configure("log4j.properties");
		if(name.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			l.info("Initializing the chrome Browser");
		}
			
		else if(name.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			l.info("Initializing the firefox Browser");
		}

		else if(name.equalsIgnoreCase("Edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			l.info("Initializing the firefox Browser");
		}

		else
			l.info("Make sure to choose the correct browsers");

		}

	}


