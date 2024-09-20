package day2.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demowebshop.tricentis.com/login");
	
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");

		driver.findElement(By.name("Password")).sendKeys("Abc@12345");
			
	 	driver.findElement(By.className("login-button")).click();


		driver.findElement(By.className("ico-logout")).click();
	}

}




/*

 * 
 * s2: perform login & logout operation in
 * https://demowebshop.tricentis.com/login tester01@vomoto.com/Abc@12345

 
 */