package day2.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.saucedemo.com/");
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		//0-30 sec, to load the element
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//0-30 sec, to load the element
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

}
/*
S1: perform login & logout operation in https://www.saucedemo.com/
	standard_user/secret_sauce
	
	<a id="logout_sidebar_link" class="bm-item menu-item" href="#" data-test="logout-sidebar-link" style="display: block;">Logout</a>
 */