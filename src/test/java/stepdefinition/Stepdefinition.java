package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@When("open url")
	public void open_url() {
		driver.get("http://www.facebook.com");
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		WebElement e = driver.findElement(By.xpath("//input[@id='email']"));
		e.sendKeys("anusha.y@gmail.com");
		WebElement p = driver.findElement(By.xpath("//input[@id='pass']"));
		p.sendKeys("903426jj@1");
	}

	@When("click on sign-in")
	public void click_on_sign_in() {

		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
	}

	@Then("user successfully login into facebook")
	public void user_successfully_login_into_facebook() {
		System.out.println("user successfully login into ac");

	}

}
