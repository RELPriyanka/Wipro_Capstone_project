package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gifts {
	WebDriver driver;
	 EbayPageC pg;
	

@Given("login page opened in defff brows")
public void login_page_opened_in_defff_brows() {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");

}

@When("click on gits")
public void click_on_gits() {
	pg.giftca();
   

}

@Then("gifts are displayed")
public void gifts_are_displayed() {


}


}
