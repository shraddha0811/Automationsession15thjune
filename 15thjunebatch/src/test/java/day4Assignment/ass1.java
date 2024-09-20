package day4Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gsmarena.com/");

		List<WebElement> devceList = driver.findElements(By.cssSelector("ul>li>a"));

		System.out.println("Total number of Devce: " + devceList.size());
		for (int i = 0; i < devceList.size(); i++) {
			System.out.println(devceList.get(i).getText());

		}

	}

}

//TC1:https://www.gsmarena.com/
//get the count of device and print there names from PHONE FINDER