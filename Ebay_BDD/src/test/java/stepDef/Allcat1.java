package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Allcat1 {
	WebDriver driver;
	 EbayPageC pg;
	

@Given("login page in deff browserr")
public void login_page_in_deff_browserr() throws InterruptedException {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    
  

}

@When("clked on boththe (.*) and (.*)$")
public void clked_on_boththe_search2_and_allcat1(String search2, String allcat1) {
	pg.allCat(search2, allcat1);
    

}

@Then("functioning good")
public void functioning_good() {
   

}




}
