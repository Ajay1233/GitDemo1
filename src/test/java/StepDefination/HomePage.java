package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LandingPage;
import pageObject.PageObjectManager;

public class HomePage {
	public WebDriver driver;
	public String Homeproductname;
	public String dealpageproductname;
	PageObjectManager pageobjectmanager;
	Testcontextsetup testcontext;

	public HomePage(Testcontextsetup testcontext) {
		this.testcontext = testcontext;

	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		// WebDriverManager.chromedriver().setup();
		// testcontext.driver = new ChromeDriver();
		// testcontext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// testcontext.testbase.WebDriverManager();
	}

	@When("User search the product with shortname {string} and extracted actual name of the product")
	public void user_search_the_product_with_shortname_and_extracted_actual_name_of_the_product(String shortname)
			throws InterruptedException {
		LandingPage landingpage = testcontext.pageobjectmanager.getLandingPage();
		landingpage.searchItem(shortname);
		Thread.sleep(3000);
		testcontext.Homeproductname = landingpage.getproductsearch().split("-")[0].trim();
		System.out.println(Homeproductname);
	}

}
