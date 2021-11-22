package browserlaunch;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class login {
	static Logger l = Logger.getLogger(login.class);

	public void loginn() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		Exceldata new1 = new Exceldata();
		PageFactory.initElements(Browsers.driver, Elements.class);
		Browsers.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		l.info("Trying to login");
		Elements.login.click();
		l.info("login page visible");
		Elements.email.sendKeys(new1.getdata(0, 0, 0));
		l.info("Email ID entered");
		Elements.pawd.sendKeys(new1.getdata(0, 0, 1));
		l.info("Password ENtered");
		Elements.SubmitLogin.click();
		l.info("clicked submit button");
		
	}
}
