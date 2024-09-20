package day3.Synchronizaion;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//0-30 sec, to load the element
		driver.get("https://online.actitime.com/uts/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//explicit wait(conditional wait)- WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//here WebDriver will wait for 20 sec max to get expected title
		//wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
			//or here WebDriver will wait for 20 sec max for logout link to be available for click
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Expected Home page title: "+expectedHomePageTitle);
		System.out.println("Actual Home page title: "+actualHomePageTitle);
		
		System.out.println("Is home page displayed after login ? "+expectedHomePageTitle.equals(actualHomePageTitle));
		
		driver.findElement(By.id("logoutLink")).click();
		
		 
		
		
		
	}

}
