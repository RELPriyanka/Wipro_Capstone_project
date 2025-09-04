package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	WebDriver driver;
	BS_Page pg;

@Given("login page opened in def browserr")
public void login_page_opened_in_def_browserr() {
	
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



}

@When("click on logout")
public void click_on_logout() {
	pg.demouser();
	pg.logout();
	
}

@Then("logout is success")
public void logout_is_success() {
	driver.close();
    

}




}
