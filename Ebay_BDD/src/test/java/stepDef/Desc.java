package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Desc {
	WebDriver driver;
	 EbayPageC pg;
	
	

@Given("login page opened in defff browser")
public void login_page_opened_in_defff_browser() {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    
  
    }

@When("click onn prod and get descc")
public void click_onn_prod_and_get_descc() {
	driver.get("https://www.ebay.com/itm/157228438909");
    String desc=pg.getDesc();
    System.out.println(desc);
	
    }

@Then("description displayed")
public void description_displayed() {
	driver.close();
   }

}
