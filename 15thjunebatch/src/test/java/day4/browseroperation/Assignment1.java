package day4.browseroperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("Page title validation status? "+pageTitle.equals(expectedTitle));
        driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.linkText("Amazon Pay")).click();
		String amazaon_pay_title=driver.getTitle();
		System.out.println("Amazon pay Page title is: " + amazaon_pay_title);
		String expectedTitle1="Amazon Pay";
		System.out.println("Amazon pay Page title validation status? "+amazaon_pay_title.equals(expectedTitle1));
		driver.navigate().back();


	}

}
