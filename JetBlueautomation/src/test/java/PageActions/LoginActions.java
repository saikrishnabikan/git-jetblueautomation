package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.PageObjects;


public class LoginActions implements PageObjects{
	
	WebDriver driver;
	public LoginActions(WebDriver driver) {
		
		this.driver=driver;
	}
public void login(String username,String pwd) {
	    driver.get("https://www.jetblue.com/signin?returnUrl=https:%2F%2Fwww.jetblue.com%2Ftrueblue%2Freasons-to-join");
	    driver.findElement(email).sendKeys("blprsd1989@gmail.com");
		driver.findElement(password).sendKeys("Blprsd1989$");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

}
}
