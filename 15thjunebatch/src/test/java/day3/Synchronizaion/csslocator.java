package day3.Synchronizaion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//css locator by tag id //syntax// tagname#id
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mobile phone");
	
		
		//css locator by tag class //syntax// tagname.classname
		
		//driver.findElement(By.cssSelector(".nav-input")).sendKeys("mobile phone");
		
		//css selector by tag attribute //syntax//tagname"[attribute='value']"
		//driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("mobile phone");

		//css selector by tag class attribute //syntax "tagname.classname[attribute='value']"
		driver.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).sendKeys("mobile phone");
	}
	

}
