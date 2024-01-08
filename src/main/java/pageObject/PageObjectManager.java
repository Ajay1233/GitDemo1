package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingpage;
	public Offer offerspage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public LandingPage getLandingPage() {

		landingpage = new LandingPage(driver);
		return landingpage;
	}

	public Offer OffersPage() {

		offerspage = new Offer(driver);
		return offerspage;
	}
}
