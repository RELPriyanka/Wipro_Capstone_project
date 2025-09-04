package browserStack;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Offers {
	WebDriver driver;
	BS_Page pg;

@Given("loginn page opened in def browser")
public void loginn_page_opened_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@When("click on each offerspage")
public void click_on_each_offerspage() {
	pg.demouser();
	pg.offers();

}

@Then("clicked on offerspage")
public void clicked_on_offerspage() {
	String expUrl="https://bstackdemo.com/offers";
	 Assert.assertEquals(driver.getCurrentUrl(),expUrl);
	driver.close();
    

}




}
