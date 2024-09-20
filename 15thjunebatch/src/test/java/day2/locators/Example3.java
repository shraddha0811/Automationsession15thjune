package day2.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//0-30 sec, to load the element
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//0-30 sec, to load the element
		driver.findElement(By.name("username")).sendKeys("Admin");
		//0-30 sec, to load the element
		driver.findElement(By.name("password")).sendKeys("admin123");
		//0-30 sec, to load the element
		driver.findElement(By.className("orangehrm-login-button")).click();
		//0-30 sec, to load the element
		driver.findElement(By.className("oxd-userdropdown-img")).click();	
		//0-30 sec, to load the element
		driver.findElement(By.linkText("Logout")).click();
	}

}

/*
 * s3: perform login & logout operation in
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 * Admin/admin123
 * 
 * <a href="/web/index.php/auth/logout" role="menuitem"
 * class="oxd-userdropdown-link">Logout</a>
 * 
 * <button data-v-10d463b7="" data-v-0af708be="" type="submit"
 * class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"
 * ><!----> Login <!----></button>
 */