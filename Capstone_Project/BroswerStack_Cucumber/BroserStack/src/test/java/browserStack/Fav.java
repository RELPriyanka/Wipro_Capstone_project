package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fav {
	WebDriver driver;
	BS_Page pg;

@Given("logn page open in def browser")
public void logn_page_open_in_def_browser() {
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


}

@When("click on a prod and addtofav")
public void click_on_a_prod_and_addtofav() {
	pg.demologin();
	pg.fav();

}

@Then("added to fav")
public void added_to_fav() {
   

}




}
