package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver;
	By loginLink = By.id("login2");
	By txt_username = By.id("loginusername");
	By txt_password = By.id("loginpassword");
	By btn_loggin = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	By usernameisdisplay = By.id("nameofuser");
	
	
	
	//Constructor
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	public void LoginClick() {
		driver.findElement(loginLink).click();
	}

	public void enterUserName(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_loggin).click();
	}
	public void successLogin() {
		driver.findElement(usernameisdisplay).isDisplayed();
	}
	
	public void loginValidUser (String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_loggin).click();
	}
}
