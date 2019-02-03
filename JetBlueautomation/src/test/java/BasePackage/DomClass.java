package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageActions.LoginActions;

public class DomClass {
	
		
	

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {
		switch(browserName) {
		case "ie":
			System.setProperty("webdriver.ie.driver", ".//sr//test//resources//iedriver.exe");
			driver=new InternetExplorerDriver();
			//ffgf
//tgfbftg
			
		case "ff":
			driver=new FirefoxDriver();	
			
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver",".//src//test//resources//chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		return driver;	
	}
	
	
	
}
