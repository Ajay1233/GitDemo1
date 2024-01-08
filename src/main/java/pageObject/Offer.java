package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offer {
	public WebDriver driver;

	public Offer(WebDriver driver) {

		this.driver = driver;

	}

	By search = By.xpath("//input[@type='search']");
	By product = By.xpath("//td[normalize-space()='Tomato']");

	public void searchItem(String Name) {

		driver.findElement(search).sendKeys(Name);

	}

	public void search() {
		driver.findElement(search).getText();
	}

	public String getproductsearch() {

		return driver.findElement(product).getText();
	}

}
