package day4Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assi2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gsmarena.com/");

		WebElement samsungLink = driver.findElement(
				By.cssSelector("html>body>#wrapper>#outer>#body>.sidebar>*:nth-child(1)>ul>*:nth-child(1)>a"));

		samsungLink.click();
		List<WebElement> samsnglist = driver.findElements(By.cssSelector(".makers strong>span"));
		System.out.println("Total number of samsung devices: " + samsnglist.size());
		for (WebElement devices : samsnglist) {

			System.out.println("Device names: " + devices.getText());
		}
	}

}

/*
 * TC2: https://www.gsmarena.com/ click on Samsung link present under PHONE
 * FINDER get device count and print there names
 */