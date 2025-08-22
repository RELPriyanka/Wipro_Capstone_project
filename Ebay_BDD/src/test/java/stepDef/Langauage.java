package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Langauage {
	WebDriver driver;
	 EbayPageC pg;
	

@Given("login page opened in defaultt browser")
public void login_page_opened_in_defaultt_browser() {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    
  


}

@When("click onn language")
public void click_onn_language() {
	pg.lang();
    System.out.println("Language changed to France.");
   

}

@Then("language changed")
public void language_changed() {
	
	
	
}

}
