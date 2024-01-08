package StepDefination;

import Utils.Testcontextsetup;
import io.cucumber.java.After;

public class Hooks {
	Testcontextsetup testcontext;
	
	public Hooks(Testcontextsetup testcontext) {
		
		this.testcontext=testcontext;
		
		}
	
	@After
	public void AfterScenario() {
		
		testcontext.testbase.WebDriverManager().quit();
	}

}
