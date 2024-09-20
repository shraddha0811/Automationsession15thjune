package day4.browseroperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Assignment2 {

	public static void main(String[] args) {
		//WebDriver driver2=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
        driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.linkText("JAVA Tutorial: A Complete Guide")).click();
		String javaPageTitle=driver.getTitle();
		String expectedTitle = "JAVA Tutorial: A Complete Guide";
		System.out.println("java page title validation status? " + expectedTitle.equals(expectedTitle));
		driver.navigate().back();
	

		
	}

}
///html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input --absolute xpath
////*[@id="user-name"]--- relatve xpath
