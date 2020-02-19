package cucumber.commom.glue;
import org.openqa.selenium.WebDriver; 


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class cucumberJava { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      System.out.println("Browser is opened");
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
	   System.out.println("Facebook website is opened");
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
	   System.out.println("Login Button is availabe");
   } 
}