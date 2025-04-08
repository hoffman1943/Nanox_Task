package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homepage;
import pages.loginpage;

public class HomePage {


	WebDriver driver = null;
	homepage home;
	
	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Given("^browser is open$")
	public void browser_is_open() {
		
		System.out.println("browser is open");
	}

	@When("^user is on the right (.*)$")
	public void user_is_on_the_right_page(String page) {
		System.out.println("user is on the right page");
		driver.navigate().to(page);

	}
	
	@Then("^elements of page is visable$")
	public void elements_of_page_is_visable() {
		System.out.println("elements of page is visable");
		home = new homepage(driver);
		home.pageUpload();

	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
