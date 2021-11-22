package browserlaunch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {

	// Login Elements
	@FindBy(className = "login")
	public static WebElement login;
	public static WebElement email;
	public static WebElement passwd;
	public static WebElement SubmitLogin;
	public static WebElement email_create;
	public static WebElement SubmitCreate;
	@FindBy(xpath = "//span[contains(text(),'Admin Adminn')]")
	public static WebElement loginname;

	// Signup Elements
	@FindBy(className = "login")
	public static WebElement signin;
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public static WebElement customer_firstname;
	public static WebElement customer_lastname;
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	public static WebElement pawd;
	public static WebElement days;
	public static WebElement months;
	public static WebElement years;
	public static WebElement address1;
	public static WebElement city;
	public static WebElement id_state;
	public static WebElement postcode;
	public static WebElement id_country;
	public static WebElement phone_mobile;
	public static WebElement alias;
	public static WebElement submitAccount;
	@FindBy(xpath = "//*[@id='header_logo']/a/img")
	public static WebElement logo;

	// ADDto cart Elements
	@FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
	public static WebElement BestSellers;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[2]/li[1]/div/div[2]/div[2]/a[2]/span")
	public static WebElement chiffonDress;
	public static WebElement group_1;
	public static WebElement quantity_wanted;
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]")
	public static WebElement cart;
	@FindBy(xpath = "//span[@id='our_price_display']")
	public static WebElement price;
	@FindBy(linkText = "javascript:print();")
	public static WebElement PDF;
	@FindBy(xpath = "//h1[contains(text(),'Printed Chiffon Dress')]")
	public static WebElement dressname;
	public static WebElement color_15;
	public static WebElement color_16;
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/div[1]/div[2]/div[1]/span[1]")
	public static WebElement hoverover;

	// Checkout
	@FindBy(css = "body.product.product-7.product-printed-chiffon-dress.category-11.category-summer-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) a.btn.btn-default.button.button-medium > span:nth-child(1)")
	public static WebElement checkout;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
	public static WebElement checkout1;
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	public static WebElement checkout2;
	public static WebElement cgv;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
	public static WebElement checkout3;
	@FindBy(className = "bankwire")
	public static WebElement pay;
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	public static WebElement confirmorder;
	@FindBy(className = "box")
	public static WebElement copytext;

}
