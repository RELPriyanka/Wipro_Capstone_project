package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	WebDriver driver;
	BS_Page pg;

@Given("login page open in def browser")
public void login_page_open_in_def_browser() {
    
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


}

@When("click on the orders page")
public void click_on_the_orders_page() {
	pg.demouser();
	pg.orders();

}

@Then("successfully orders page is opened")
public void successfully_orders_page_is_opened() {
	 String expUrl="https://bstackdemo.com/orders";
	 Assert.assertEquals(driver.getCurrentUrl(),expUrl);
	driver.close();
    

}




}
