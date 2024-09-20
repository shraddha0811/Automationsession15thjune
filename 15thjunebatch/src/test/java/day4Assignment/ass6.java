package day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(50));
		driver.get("https://www.saucedemo.com/");
		driver.getTitle();
		System.out.println("title of page is " + driver.getTitle());
		String expectedTitle = "Swag Labs";
		System.out.println("Current title of page is equals to Expeted Title " + driver.getTitle().equals(expectedTitle));
		driver.getCurrentUrl();
		System.out.println("Current URL of page is " + driver.getCurrentUrl());
		String expectedUrl="https://www.saucedemo.com/";
		System.out.println("current URL of page is equals to Expeted URL "+ driver.getCurrentUrl().equals(expectedUrl));
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input"))
			.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

}
