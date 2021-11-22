package browserlaunch;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Signup {
	static Logger l = Logger.getLogger(Signup.class);

	public void Signin() throws InterruptedException {
		String actualUrl = "http://automationpractice.com/index.php?controller=my-account";
		String expectedUrl = Browsers.driver.getCurrentUrl();

		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			l.info("logged in already");
		} else {
			l.info("Trying to signin");
			try {
				Exceldata new1 = new Exceldata();
				Browsers.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				PageFactory.initElements(Browsers.driver, Elements.class);
				Elements.signin.click();
				Elements.email_create.sendKeys(new1.getdata(1, 0, 0));
				Elements.SubmitCreate.click();
				Elements.customer_firstname.sendKeys(new1.getdata(1, 0, 1));
				Elements.customer_lastname.sendKeys(new1.getdata(1, 0, 2));
				Elements.passwd.sendKeys(new1.getdata(1, 0, 3));
				Select a = new Select(Elements.days);
				a.selectByValue(new1.getdata(1, 0, 4));
				Elements.months.sendKeys(new1.getdata(1, 0, 5));
				Select c = new Select(Elements.years);
				c.selectByValue(new1.getdata(1, 0, 6));
				Elements.address1.sendKeys(new1.getdata(1, 0, 7));
				Elements.city.sendKeys(new1.getdata(1, 0, 8));
				Elements.id_state.sendKeys(new1.getdata(1, 0, 9));
				Elements.postcode.sendKeys(new1.getdata(1, 0, 10));
				Elements.id_country.sendKeys(new1.getdata(1, 0, 11));
				Elements.phone_mobile.sendKeys(new1.getdata(1, 0, 12));
				Elements.alias.sendKeys(new1.getdata(1, 0, 13));
				Elements.submitAccount.click();
				l.info("Signin sucessfully");
			} catch (Exception e) {
				l.info("proceed with the program");
			}
		}
	}
}