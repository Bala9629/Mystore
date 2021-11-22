package browserlaunch;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtoCart {

	Exceldata obj = new Exceldata();
	static Logger l = Logger.getLogger(AddtoCart.class);
	String rate;
	String Textonconfirmation;

	@BeforeMethod
	public void log4j() {
		PropertyConfigurator.configure("log4j.properties");
	}

	@Test(priority = 0)
	public void clickingondress() throws InterruptedException {
		PageFactory.initElements(Browsers.driver, Elements.class);
		Browsers.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Elements.logo.click();
		Elements.BestSellers.click();
		l.info("CLicked on Bestseller page");
		Actions a = new Actions(Browsers.driver);
		a.moveToElement(Elements.hoverover).perform();
		a.moveToElement(Elements.chiffonDress);
		a.click().build().perform();
		l.info("clicked on chiffon dress");

	}

	@Test(priority = 1)
	public void dataenterincart() {
		Browsers.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Elements.quantity_wanted.clear();
		Elements.quantity_wanted.sendKeys(obj.getdata(2, 1, 1));
		l.info("quantity choosen");
		Select a = new Select(Elements.group_1);
		a.selectByVisibleText(obj.getdata(2, 1, 2));
		l.info("choose the size");
		if (obj.getdata(2, 1, 3) == "Green") {
			Elements.color_15.click();
			l.info("Green color has been selected");
		} else {
			Elements.color_16.click();
			l.info("Yellow color has been selected");
		}
		rate = Elements.price.getText();
		Filestore(rate);
		Elements.cart.click();

	}

	public void Filestore(String s) {

		File DestFile = new File("E:\\java\\Price.txt");
		try {
			FileUtils.writeStringToFile(DestFile, rate);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void checkout() throws InterruptedException, AWTException {
		Browsers.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Actions a = new Actions(Browsers.driver);
		a.moveToElement(Elements.checkout).perform();
		a.click().build().perform();
		Elements.checkout1.click();
		Elements.checkout2.click();
		Elements.cgv.click();
		Elements.checkout3.click();
		Elements.pay.click();
		Elements.confirmorder.click();
		l.info("Ordered confirmed");
		Textonconfirmation = Elements.copytext.getText();
		Filestore(Textonconfirmation);
		Browsers.driver.close();
		l.info("closed the page");

	}

}
