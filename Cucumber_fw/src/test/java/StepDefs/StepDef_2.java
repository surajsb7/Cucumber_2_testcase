package StepDefs;
//import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_2 {

	@Given("User opened browser")
	public void user_opened_browser() {
		System.out.println("Stepdef 2 - 1");
	}

	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
		System.out.println("Stepdef 2 - 2");
	}

	@When("User Search for product {string}")
	public void user_search_for_product(String string) {
		System.out.println("Stepdef 2 - 3");
	}

	@When("User click on any product")
	public void user_click_on_any_product() {
		System.out.println("Stepdef 2 - 4");
	}

	@Then("Product Description is displayed in new tab")
	public void product_description_is_displayed_in_new_tab() {
		System.out.println("Stepdef 2 - 5");
	}
}
