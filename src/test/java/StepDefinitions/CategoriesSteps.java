
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
import pages.Categoriespage;
import pages.PurchasePage;


public class CategoriesSteps {


	WebDriver driver = null;
	Categoriespage categories;

	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		categories = new Categoriespage(driver);

	}
	@Given("^open home page (.*)$")
	public void open_homePage(String page) {
		System.out.println("browser is open");
		System.out.println("user is on login page");
		driver.navigate().to(page);
	
	}
	@When("^user choose category phones$")
	public void user_choose_category_phones() throws InterruptedException {
		System.out.println("user choose category phones");
		//Thread.sleep(2000);
		categories.phones_Click();
	}
	@And("^phones category page opened$")
	public void phones_category_page_opened() throws InterruptedException {
		System.out.println("phones category page opened");
		categories.phones_categgory_item();
	}
	@And("^user choose category laptops$")
	public void user_choose_category_laptops() throws InterruptedException {
		System.out.println("user choose category laptops");
		categories.laptops_Click();

	}
	@And("^laptops category page opened$")
	public void laptops_category_page_opened() throws InterruptedException {
		System.out.println("clicks on login button");
		categories.laptops_categgory_item();
	}
	@And("^user choose category monitors$")
	public void user_choose_category_monitors() throws InterruptedException {
		System.out.println("user choose category laptops");
		categories.monitor_Click();

	}
	@And("^monitors category page opened$")
	public void monitors_category_page_opened() throws InterruptedException {
		System.out.println("clicks on login button");
		categories.monitor_categgory_item();
	}

	@Then("^all categories load successfully$")
	public void all_categories_load_successfully() throws InterruptedException {
		System.out.println("all categories load successfully");
		
	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}












}
