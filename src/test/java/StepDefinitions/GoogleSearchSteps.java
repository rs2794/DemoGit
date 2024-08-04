//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSearchSteps {
//    
//	WebDriver driver =null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	  System.out.println("Inside step- browser is open");
//	  
//	  String projectpath = System.getProperty("user.dir");
//	  System.out.println("Project path is "+ projectpath);
//	  
//	  System.setProperty("Webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
//	   
//	  driver = new ChromeDriver();
//	  
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside step- user is on google search page");
//		
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("Inside step- User enters a text");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");;
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside step- And hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search result")
//	public void user_is_navigated_to_search_result() {
//		System.out.println("Inside step- Navigated to search result");
//		
//		driver.getPageSource().contains("Online Courses");
//		
//		driver.close();
//	}
//}
