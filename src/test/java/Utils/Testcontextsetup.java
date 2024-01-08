package Utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class Testcontextsetup {
	public WebDriver driver;
	public String Homeproductname;
	public TestBase testbase;
	public GenericUtils genericutils;
	public PageObjectManager pageobjectmanager;

	public Testcontextsetup() {

		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		genericutils = new GenericUtils(testbase.WebDriverManager());

	}

}
