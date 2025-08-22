
package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopBycart {
	
	WebDriver driver;
	EbayPageC pg;
	

@Given("login page in deff browser")
public void login_page_in_deff_browser() throws InterruptedException {
	
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    
	
	
    }

@When("click on shopbycat andd select any cat")
public void click_on_shopbycat_andd_select_any_cat() throws InterruptedException {
	
	pg.shopByCat();
	
	
    }

@Then("functioning")
public void functioning() {
	
	driver.close();
	
	
    }





}
