package browserStack;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BSTack {
	WebDriver driver;
	BS_Page pg;

@BeforeTest
public void beforeTest() {
    driver = new ChromeDriver();
    pg = new BS_Page(driver);
    driver.get("https://bstackdemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

	
	
	
  @Test (priority =1)
  public void login() {
	    pg.demologin();
	  //pg.imagenotloadinguser();
	  //pg.existingordersuser();
	  //pg.favuser();
	  //pg.lockeduser();
  }
  


  @Test(priority =2)
  public void deleteitemfromcart() throws InterruptedException {
	   
	   pg.addnDelfromcart();
	  
  }
  
  @Test(priority = 3)
  public void shipping() {
	  pg.shippingaddress();
  }
  
  @Test(priority = 4)
  public void search1() throws InterruptedException {
	  String[] items={"apple","google","galaxy","oneplus"};
      for (String i:items) {
          pg.search(i);
          Thread.sleep(2000);
	 	  
  }
  }

  
  @Test(priority = 5)
  public void shopbybrand() {
	  pg.brand();
	  
  }
  @Test(priority = 6)
  public void favorites() {
	  pg.fav();
  }

  @Test(priority = 7)
  public void offers() {
	   pg.offers();
  }
  @Test(priority = 8)
  public void oders() {
	  pg.orders();
  }
  
  
  @Test(priority = 9)
  public void privacypolicy() {
	  pg.privacypolicy();
  }
  
  @Test(priority = 10)
  public void logout() {
	   pg.logout();
  }
 /* @Test(priority = 11)
  public void subsribe() {
	  pg.subsc();
  }*/
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
