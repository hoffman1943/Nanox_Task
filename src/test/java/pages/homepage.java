
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {

	WebDriver driver;

	By loggoDisplay = By.id("nava");
	
	//Constructor
	public homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void pageUpload() {
		driver.findElement(loggoDisplay).isDisplayed();
	}
}