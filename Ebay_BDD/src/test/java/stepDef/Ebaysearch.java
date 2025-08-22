package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebaysearch {
	WebDriver driver;
	 EbayPageC pg;
	

@Given("login user and search button in browser")
public void login_user_and_search_button_in_browser() throws InterruptedException {
	 driver=new ChromeDriver();
     pg=new EbayPageC(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     driver.get("https://www.ebay.com/");

     
    
   

}

@When("^enter (.*)$")
public void enter_item(String item) {
	pg.search(item);

	
   

}

@Then("list of output relevant to input")
public void list_of_output_relevant_to_input() {
	driver.close();
   

}




}
