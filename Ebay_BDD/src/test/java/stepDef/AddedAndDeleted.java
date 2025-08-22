package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddedAndDeleted {
	WebDriver driver;
	EbayPageC pg;

@Given("login page is opened in deff browser")
public void login_page_is_opened_in_deff_browser() throws InterruptedException {
	 driver=new ChromeDriver();
     pg=new EbayPageC(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     
     driver.get("https://www.ebay.com/");
     driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
     WebElement name = driver.findElement(By.id("userid"));
     
     name.sendKeys("ravadapriyankael.6@gmail.com");
     driver.findElement(By.id("signin-continue-btn")).click();
     WebElement pass = driver.findElement(By.id("pass"));
     
     pass.sendKeys("Priya@678");
     driver.findElement(By.id("sgnBt")).click();
     Thread.sleep(3000);
    
} 

@When("clicked on image should add and deleted from cart")
public void clicked_on_image_should_add_and_deleted_from_cart() throws InterruptedException {
	 
	pg.addAndDeleteFromCart();  
    

}

@Then("steps are successed")
public void steps_are_successed() {
	driver.close();
   

}




}
