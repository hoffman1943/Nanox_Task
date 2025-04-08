package StepDefinitions;
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
import pages.PurchasePage;



public class PurchaseSteps {
	
	WebDriver driver = null;
	PurchasePage purchase;
	
	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		purchase = new PurchasePage(driver);
		
		
	}
	@Given("^user is on home page (.*)$")
	public void user_is_on_homePage(String page) {
		System.out.println("user is on login page");
		System.out.println("browser is open");
		driver.navigate().to(page);
		//purchase = new PurchasePage(driver);
	}
	@When("^user choose product$")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("user choose product");
		Thread.sleep(2000);
		//purchase = new PurchasePage(driver);
		purchase.product_Click();
	}
	@And("^clicks on add to cart$")
	public void clicks_on_add_to_cart() throws InterruptedException {
		System.out.println("clicks on login button");
		purchase.add_to_cart();
	}
	@And("^go to cart$")
	public void go_to_cart() throws InterruptedException {
		System.out.println("user go to cart");
		purchase.go_to_cart();
		purchase.btn_place_order_click();

	}
	@And("^complete purchase insert (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+)$")
	public void complete_purchase_insert_Deatils(String name, String country, String city, String credit_card, String month, String year) throws InterruptedException {
		System.out.println("user enter details");
		Thread.sleep(3000);
		purchase.enterUserName(name);
		purchase.enterCountry(country);
		purchase.enterCity(city);
		purchase.enterCreditCard(credit_card);
		purchase.enterMonth(month);
		purchase.enterYear(year);
		purchase.purchase_click();
		Thread.sleep(2000);
	}
	@Then("^purchase complete successfully$")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    System.out.println("user is navigated to the home page");
	    purchase.purchase_complete();
	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
