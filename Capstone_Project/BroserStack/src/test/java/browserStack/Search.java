package browserStack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	BS_Page pg;

@Given("logi page open in def browser")
public void logi_page_open_in_def_browser() {
   
	driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@When("give multiple search (.*)$")
public void give_multiple_search_input(String input) throws InterruptedException {
    
        pg.search(input);
        
}


@Then("search is successful")
public void search_is_successful() {
	driver.close();
    

}




}
