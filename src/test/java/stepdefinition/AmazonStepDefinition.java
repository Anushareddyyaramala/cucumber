package stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinition {
	WebDriver driver;
	@Given("launching the browser")
	public void launching_the_browser() {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   
	}

	@Given("login to url")
	public void login_to_url() {
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	}

	@When("select the product")
	public void select_the_product() {
	  WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  search.sendKeys("xiomi poco x3 pro");
	  search.sendKeys(Keys.ENTER);
	  
	  List<WebElement> l=driver.findElements(By.xpath("//img[@class='s-image']"));
	  l.get(1).click();
	  
	  
	}

	@When("add the product to cart")
	public void add_the_product_to_cart() {
		
		Set <String> s=driver.getWindowHandles();
		List<String>a=new ArrayList(s);
		driver.switchTo().window(a.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
	}

	@When("check the cart")
	public void check_the_cart() {
	driver.findElement(By.className("a-button-input")) .click();
	}

}
