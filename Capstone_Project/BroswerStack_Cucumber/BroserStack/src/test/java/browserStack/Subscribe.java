package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscribe {
	WebDriver driver;
	BS_Page pg;

@Given("log page open in deff browser")
public void log_page_open_in_deff_browser() {
   

	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@When("give input in the (.*) field$")
public void give_input_in_the_email_field(String email) {
	pg.subsc(email);
	
}


@Then("email entered successfully")
public void email_entered_successfully() {
   

}




}
