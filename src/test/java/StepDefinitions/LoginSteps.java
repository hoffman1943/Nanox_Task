package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;

public class LoginSteps {


	WebDriver driver = null;
	loginpage login;
	
	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}



	@Given("^user is on login (.*)$")
	public void user_is_on_login_page(String page) {

		System.out.println("user is on login page");
		System.out.println("browser is open");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
		driver.navigate().to(page);
		login = new loginpage(driver);
		login.LoginClick();

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("user enters username and password");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		login = new loginpage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
	}




	@And("^clicks on login button$")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("clicks on login button");
		login.clickLogin();
		//Thread.sleep(2000);
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("user is navigated to the home page");
		Thread.sleep(3000);
		login.successLogin();
//		driver.close();
//		driver.quit();
	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	

}
