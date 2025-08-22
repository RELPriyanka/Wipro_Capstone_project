package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Privacypol {
	WebDriver driver;
	 EbayPageC pg;

@Given("page opened in defaultt browser")
public void page_opened_in_defaultt_browser() {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    

}

@When("scroll to down and click privacy policy")
public void scroll_to_down_and_click_privacy_policy() {
	pg.privacypol();
   

}

@Then("accessed")
public void accessed() {
	
	
   

}


}
