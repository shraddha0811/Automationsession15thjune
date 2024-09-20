package day1.browserInstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assinment2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");

		String pageTitle = driver.getTitle();

		System.out.println("Current page title is " + pageTitle);

		
		String expectedTitle="Facebook – log in or sign up";
		
		System.out.println("facebook page validation status? "+pageTitle.equals(expectedTitle));
		
		
		//driver.close();

	}

}

/*
  
 * Scenario to Automate: 1. Launch the firefox browser. 2. Open the
 * URL https://www.facebook.com in the current browser. 3. Fetching home page
 * title. 4. Verify actual tile of the home page with the expected title. 5.
 * Print home page title on the console. 6. Close the browser.
 
 */