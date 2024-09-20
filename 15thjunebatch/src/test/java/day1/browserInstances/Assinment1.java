package day1.browserInstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		String pageTitle = driver.getTitle();

		System.out.println("Current page title is " + pageTitle);

		String title = driver.getTitle();

		int titleLength = driver.getTitle().length();
		
		System.out.println("Title of the page is : " + title);
		
		System.out.println("Length of the title is : " + titleLength);
		
		String currentpageURL=driver.getCurrentUrl();
		
		System.out.println("Current page URL is "+currentpageURL);
		
		String expectedUrl="https://demo.vtiger.com/vtigercrm/index.php";
		
		System.out.println("Vtiger page validation status? "+currentpageURL.equals(expectedUrl));
		
		String pageSource = driver.getPageSource();  
        
		int pageSourceLength = pageSource.length(); 
		
		System.out.println("Total length of the Page Source is : " + pageSourceLength);  
		
		//driver.close();

	}

}

/*
 * Scenario to Automate: Launch a new Chrome browser. Open
 * https://demo.vtiger.com/ Get Page Title name and Title length Print Page
 * Title and Title length on the Eclipse Console. 
 * Get Page URL and verify if it is a correct page opened Get Page Source (HTML Source code) and Page Source
   length Close the Browser.
   
 */