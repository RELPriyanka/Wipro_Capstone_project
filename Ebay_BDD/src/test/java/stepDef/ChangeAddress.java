package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeAddress {
	WebDriver driver;
	EbayPageC pg;
	

@Given("login page in def browser")
public void login_page_in_def_browser() throws InterruptedException {
	driver=new ChromeDriver();
    pg=new EbayPageC(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    driver.get("https://www.ebay.com/");
    Thread.sleep(3000);
    driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
    WebElement name = driver.findElement(By.id("userid"));
    
    name.sendKeys("ravadapriyankael.6@gmail.com");
    driver.findElement(By.id("signin-continue-btn")).click();
    WebElement pass = driver.findElement(By.id("pass"));
    
    pass.sendKeys("Priya@678");
    driver.findElement(By.id("sgnBt")).click();
    Thread.sleep(3000);

}

@When("^clicked on (.*) and (.*) fields$")
public void clicked_on_lastn_and_city1_fields(String lastn, String city1) throws InterruptedException {
    pg.address1(lastn, city1);

}

@Then("successed in changing")
public void successed_in_changing() {
	driver.close();
   

}




}
