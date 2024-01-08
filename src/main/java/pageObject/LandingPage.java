package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	private By search = By.xpath("//input[@type='search']");
	private By product = By.cssSelector("h4.product-name");
	private By offerdeals=By.partialLinkText("Top Deals");

	public void searchItem(String Name) {

		driver.findElement(search).sendKeys(Name);

	}

	public void search() {
		driver.findElement(search).getText();
	}

	public String getproductsearch() {

		return driver.findElement(product).getText();
	}
 public void dealspage() {
	 
	 driver.findElement(offerdeals).click();
 }


}
