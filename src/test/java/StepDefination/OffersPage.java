package StepDefination;

import org.testng.Assert;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.Offer;
import pageObject.PageObjectManager;

public class OffersPage {
	
	public String dealpageproductname;
	Testcontextsetup testcontext;
	PageObjectManager pageobjectmanager;

	public OffersPage(Testcontextsetup testcontext) {
		this.testcontext = testcontext;
	}

	@Then("User searched for same {string} shortname on deals page if the product exist")
	public void user_searched_for_same_shortname_on_deals_page_if_the_product_exist(String shortname)
			throws InterruptedException {
		switchwindow();
		Offer of= testcontext.pageobjectmanager.OffersPage();
		of.searchItem(shortname);
		Thread.sleep(5000);
        dealpageproductname=of.getproductsearch();
	}

	public void switchwindow() {
		//pageobjectmanager= new PageObjectManager(testcontext.driver);
	    LandingPage lp= testcontext.pageobjectmanager.getLandingPage();
	    lp.dealspage();
		testcontext.genericutils.ParenttoChild();
		
	}

	@Then("Validate product name in deals page matches with Home page")
	public void validate_product_name_in_deals_page_matches_with_home_page() {

		Assert.assertEquals(dealpageproductname, testcontext.Homeproductname);

	}

}
