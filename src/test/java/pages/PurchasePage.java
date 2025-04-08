package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

	WebDriver driver;
	By product_link = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
	By btn_add_to_cart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	By btn_cart = By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
	By btn_place_order = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	
	By txt_name = By.id("name");
	By txt_country = By.id("country");
	By txt_city = By.id("city");
	By txt_credit_card = By.id("card");
	By txt_month = By.id("month");
	By txt_year = By.id("year");
	By btn_purchase = By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]");
	By purchase_completed = By.xpath("//h2[text()='Thank you for your purchase!']");

	//Constructor
	public PurchasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void product_Click() {
		driver.findElement(product_link).click();
	}
	public void add_to_cart() {
		driver.findElement(btn_add_to_cart).click();
	}
	public void go_to_cart() {
		driver.findElement(btn_cart).click();
	}
	
	public void btn_place_order_click() {
		driver.findElement(btn_place_order).click();
	}
	public void enterUserName(String name) {
		driver.findElement(txt_name).sendKeys(name);
	}
	
	public void enterCountry(String country) {
		driver.findElement(txt_country).sendKeys(country);
	}
	public void enterCity(String city) {
		driver.findElement(txt_city).sendKeys(city);
	}
	public void enterCreditCard(String credit_card) {
		driver.findElement(txt_credit_card).sendKeys(credit_card);
	}
	public void enterMonth(String month) {
		driver.findElement(txt_month).sendKeys(month);
	}
	public void enterYear(String year) {
		driver.findElement(txt_year).sendKeys(year);
	}
	public void purchase_click() {
		driver.findElement(btn_purchase).click();
	}
	public Object purchase_complete() {
		return driver.findElement(purchase_completed).isDisplayed();
		
	}

//	public void loginValidUser (String username, String password) {
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_loggin).click();
//	}

}
