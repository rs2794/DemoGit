package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
    
	By txt_username = By.id("email");
	
	By txt_password = By.id("passwd");
	
	By btn_login = By.name("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterUserName(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password); 
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
//	
//	public void validUser(String username, String password) {
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password); 
//		driver.findElement(btn_login).click();
//	}
}


