
package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logine {
	 WebDriver driver;
	 EbayPageC pg;

@Given("login page opened in def browser")
public void login_page_opened_in_def_browser() {
	        driver=new ChromeDriver();
	        pg=new EbayPageC(driver);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://www.ebay.com/");
	        pg=new EbayPageC(driver);
}


@When("click on (.*) and (.*)$")
public void click_on_email_and_password(String email, String password) {
	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
	pg.login(email, password);
    

}

	


@Then("login is success")
public void login_is_success() {
	driver.close();
    
}
}     


