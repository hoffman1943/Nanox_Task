package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Categoriespage {
	
	
	
	WebDriver driver;
	By phones_category = By.xpath("/html/body/div[5]/div/div[1]/div/a[2]");
	By phones_category_item = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
	By laptop_category = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");
	By laptop_category_item = By.xpath("//a[normalize-space()='Sony vaio i5']");
	By monitor_category = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
	By monitor_category_item = By.xpath("//a[normalize-space()='Apple monitor 24']");
	


	//Constructor
	public Categoriespage(WebDriver driver) {
		this.driver = driver;
	}
	public void phones_Click() {
		driver.findElement(phones_category).click();
	}
	public Object phones_categgory_item() {
		return driver.findElement(phones_category_item).isDisplayed();
	}
	public void laptops_Click() {
		driver.findElement(laptop_category).click();
	}
	public Object laptops_categgory_item() {
		return driver.findElement(laptop_category_item).isDisplayed();
	}
	public void monitor_Click() {
		driver.findElement(monitor_category).click();
	}
	public Object monitor_categgory_item() {
		return driver.findElement(monitor_category_item).isDisplayed();
	}

}
