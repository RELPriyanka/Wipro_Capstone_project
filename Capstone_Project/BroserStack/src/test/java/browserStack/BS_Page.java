package browserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BS_Page {
WebDriver driver;
	
	public BS_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	
		public void demouser() {
		    driver.findElement(By.id("signin")).click();
		    driver.findElement(By.id("username")).click();
		    driver.findElement(By.xpath("//div[text()='demouser']")).click();
		    driver.findElement(By.id("password")).click();
			driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();    
		    driver.findElement(By.id("login-btn")).click();
		}
	
	
	
	public void imagenotloadinguser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='image_not_loading_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void existingordersuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='existing_orders_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void favuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='fav_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void lockeduser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='locked_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	
	public void logout() {
		driver.findElement(By.id("signin")).click();
	}
	 
	//*[@id="1"]/div[4]
	public void addnDelfromcart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class=\"float-cart__close-btn\"]")).click();
		
		if (driver.findElement(By.cssSelector("span[class=\"bag bag--float-cart-closed\"]")).isDisplayed()) {
		    driver.findElement(By.cssSelector("span[class=\"bag bag--float-cart-closed\"]")).click();
		} else {
		    System.out.println("Element not visible");
		}

		driver.findElement(By.cssSelector("div[class=\"shelf-item__del\"]")).click();
		
	}
	
	public void shippingaddress() {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
		WebElement fname = driver.findElement(By.id("firstNameInput"));
		fname.sendKeys("eswari");
		fname.sendKeys(Keys.ENTER);
		
		WebElement lname = driver.findElement(By.id("lastNameInput"));
		lname.sendKeys("ravada");
		lname.sendKeys(Keys.ENTER);
		
		WebElement address = driver.findElement(By.id("addressLine1Input"));
		address.sendKeys("vizag");
		address.sendKeys(Keys.ENTER);
		
		WebElement state = driver.findElement(By.id("provinceInput"));
		state.sendKeys("AP");
		state.sendKeys(Keys.ENTER);
		
		WebElement pin = driver.findElement(By.id("postCodeInput"));
		pin.sendKeys("535103");
		pin.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		
		driver.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	}
	
	public void search(String q) {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		WebElement search=driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.clear();
        search.sendKeys(q);
        search.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
		
	        
	}
	
	public void brand() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")).click();

	}

	
	public void fav()
	{
		driver.findElement(By.xpath("//span[@class='MuiIconButton-label'][1]")).click();
	}
	public void privacypolicy() {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		driver.findElement(By.cssSelector("span[style=\"right: 0%;\"][class=\"block absolute\"]")).click();
	}
	public void offers() {
		driver.findElement(By.id("offers")).click();
	}
	public void subsc(String t) {
		driver.findElement(By.id("newsletter-email")).sendKeys(t);
	}
	public void orders() {
		driver.findElement(By.id("orders")).click();
	}
	
	
	

}
