package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	BS_Page pg;


@Given("login page opened in def browser")
public void login_page_opened_in_def_browser() {
	 	driver = new ChromeDriver();
	    pg = new BS_Page(driver);
	    driver.get("https://bstackdemo.com/");
	    			
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on usern and pass")
public void click_on_usern_and_pass() {
   
	pg.demouser();

}

@Then("login is success")
public void login_is_success() {
	
	driver.close();

} //https://bstackdemo.com/




}
