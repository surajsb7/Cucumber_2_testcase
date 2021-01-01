package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_1 {

	WebDriver driver;
	String base_url = "https://amazon.in";
	String productName;

	@Given("User opened browser")
	public void user_opened_browser() {
		System.out.println("step1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srjbo\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
		driver.get(base_url);
	}

	@When("User Search for product {string}")
	public void user_search_for_product(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("Search Result page is displayed")
	public void search_result_page_is_displayed() {
		System.out.println("step4");
		WebDriverWait webDriverWait1 = new WebDriverWait(driver, 20);
		webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));
		Assert.assertEquals("Page Title validation", "Amazon.in : Laptop", driver.getTitle());
	}
}
