package browserStack;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addnddel {
	WebDriver driver;
	BS_Page pg;


@Given("log page opened in def browser")
public void log_page_opened_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


}

@When("click on add and del from cart")
public void click_on_add_and_del_from_cart() throws InterruptedException {
   pg.addnDelfromcart();

}

@Then("successful")
public void successful() {
	
	
	driver.close();
   }




}
