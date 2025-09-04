package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Brand {
	WebDriver driver;
	BS_Page pg;

@Given("logn page opened in def browser")
public void logn_page_opened_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


}

@When("click on each brand")
public void click_on_each_brand() {
	pg.brand();
    

}

@Then("clicked on each brand")
public void clicked_on_each_brand() {
	driver.close();
    

}




}
