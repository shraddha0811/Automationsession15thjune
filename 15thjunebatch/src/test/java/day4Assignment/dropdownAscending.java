package day4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownAscending {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement year_dropdown = driver.findElement(By.id("yearbox"));

		Select slt = new Select(year_dropdown);

		List actualList = new ArrayList();

		List<WebElement> options = slt.getOptions();

		for (WebElement op : options) {
			
			System.out.println(op.getText());
			
			String data = op.getText();
			
			actualList.add(data);
		}

		List tepmList = new ArrayList();

		Collections.sort(tepmList);

		System.out.println(actualList.equals(tepmList));
		
		
		
		
		
	}
}
