//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class DemoLogin {
//
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectpath = System.getProperty("user.dir");
//	  System.setProperty("Webdriver.chrome.driver",projectpath+ "/src/test/resources/Drivers/chromedriver.exe");
//	   driver =new ChromeDriver();
//	   driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("inside step- User is on a login page");
//	    driver.get("https://demo.guru99.com/test/login.html");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		System.out.println("inside step- User enters username and password");
//	     
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("passwd")).sendKeys(password);
//	
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		System.out.println("inside step- User clicks on the login  button");
//		
//		driver.findElement(By.name("SubmitLogin")).click();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		System.out.println("inside step- User is on home page");
//		
//		driver.getPageSource().contains("Successfully Logged in...");
//		
//		driver.close();
//	}
//
//}