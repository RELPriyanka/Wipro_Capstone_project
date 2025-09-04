package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Address {
	WebDriver driver;
	BS_Page pg;

@Given("log page open in def browser")
public void log_page_open_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("clhange the address after checkout")
public void clhange_the_address_after_checkout() {
	pg.demouser();
    pg.shippingaddress();

}

@Then("successfully changed address")
public void successfully_changed_address() {
	
   driver.close();

}
//https://bstackdemo.com/checkout


}
