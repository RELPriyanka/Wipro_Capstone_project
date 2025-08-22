
 
package stepDef;



import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayPageC {         
    WebDriver driver;
    
    
  
    By desc=By.xpath("//*[@id=\"mainContent\"]/div[1]/div[1]/h1/span");
    
    By btn= By.cssSelector("button[class=\"gf-flag__button\"]");
    By flang=By.partialLinkText("France");
    By catDrop =By.id("gh-cat");
    By sbcb=By.xpath("//*[@id=\"gh\"]/section/div/div/div/button");
    By fclink=By.cssSelector("a[_sp=\"m570.l3409\"]");
    By sbclink=By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[5]/span/a");
    By cd=By.id("gh-cat");
    By giftc=By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[4]/a");
    By gifts=By.xpath("/html/body/main/section[1]/div/div[2]/nav/div[6]/a");	
    By privacyp=By.xpath("//*[@id=\"glbfooter\"]/footer/div[2]/a[8]");
    
    public EbayPageC(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String email, String password) {
    	
        driver.findElement(By.id("userid")).sendKeys(email);
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
    }
    public void search(String item) {
        WebElement searcha= driver.findElement(By.id("gh-ac"));
        searcha.clear();
        searcha.sendKeys(item);
        searcha.sendKeys(Keys.ENTER);
    }
    
    
    public void addAndDeleteFromCart() throws InterruptedException {
    	
    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
		search.clear();
		search.sendKeys("Book Delay Deny Defend by Jay Feinman Official Distributor Paperback Edition In Stock");
	
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Delay Deny Defend by Jay Feinman Official Distributor Paperback Edition In Stock")).click();
		Thread.sleep(2000);
		
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
     
		try {
			driver.findElement(By.id("atcBtn_btn_1")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Add to cart button not found.");
		}
		driver.get("https://cart.ebay.com/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Remove button not found.");
		}
      /*
    	driver.findElement(By.xpath("//*[@id=\"item34d5bcfa31\"]/div/div[1]/div/a/div/img")).click();
    								
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.id("atcBtn_btn_1")).click();
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[2]/div[5]/div/a/span")).click();
        Thread.sleep(5000); 
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[1]/div[1]/div[1]/ul/li/div/div/div/div[2]/span[3]/button")).click();
        Thread.sleep(3000);
    */
    }

    
    public void address1(String lastn, String city1) throws InterruptedException {
        Actions a=new Actions(driver);
    	WebElement change=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button"));
    				
    	a.moveToElement(change).perform();
    	driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
    	driver.findElement(By.id("account-settings-link-PI")).click();
    	driver.findElement(By.xpath("//*[@id=\"individual_personal_info_address_edit_button\"]")).click();
    	driver.findElement(By.id("lastName")).sendKeys(lastn);
    	driver.findElement(By.id("city")).sendKeys(city1);
    	driver.findElement(By.id("country")).click();
    	driver.findElement(By.cssSelector("select>option[value=\"IN\"]")).click();
    	driver.findElement(By.id("address_edit_submit_button")).click();
    	
    	    	
    }
    
    
    public void shopByCat() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[_sp=\"m570.l3409\"]")).click(); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[5]/span/a")).click();
    }

   
    public void allCat(String search2, String allcat1) {
        WebElement catDrop = driver.findElement(By.id("gh-cat"));
        Select s=new Select(catDrop);
        s.selectByValue(search2); 
        WebElement searchs=driver.findElement(By.id("gh-ac"));
        searchs.clear();
        searchs.sendKeys(allcat1);
        searchs.sendKeys(Keys.ENTER);
    }
    
   
    public String getDesc() {
        return driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[1]/h1/span")).getText();
        
    }

    
    public void lang() {
        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(0)); // switch to main window
        driver.navigate().to("https://www.ebay.com/"); // navigate to main page
        WebElement cbtn = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
        cbtn.sendKeys(Keys.ENTER);
        driver.findElement(flang).click();
        
    }  
    public void giftca() {
    	driver.findElement(giftc).click();
    	driver.findElement(gifts).click();
    	
    	
    }
    public void privacypol() {
    	
    	driver.findElement(privacyp).click();
    }
    

    	
    	
}

    /* public void changename(String v) throws InterruptedException
    {
    	 Actions a = new Actions(driver);
         WebElement change = driver.findElement(changename1);
         a.moveToElement(change).perform();
         Thread.sleep(3000);
         driver.findElement(cn2).click();
         driver.findElement(cn3).click();
         driver.findElement(cn4).click();
         driver.findElement(uname).sendKeys(v);
         driver.findElement(submit).click();
         Thread.sleep(2000); 	
         
         
    }
    }*/











