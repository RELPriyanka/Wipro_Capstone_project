package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrivacyPolicy {
	
	WebDriver driver;
	BS_Page pg;
@Given("loginn page open in def browser")
public void loginn_page_open_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



}

@When("click on the privacynote in footer")
public void click_on_the_privacynote_in_footer() {
    pg.privacypolicy();


}

@Then("successfully clicked")
public void successfully_clicked() {
   

}




}
