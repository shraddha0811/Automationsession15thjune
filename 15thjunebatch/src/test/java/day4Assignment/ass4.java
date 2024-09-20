package day4Assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement year_dropdown = driver.findElement(By.id("yearbox"));

		Select slt = new Select(year_dropdown);

		System.out.println("is dropdown visible on the screen? " + year_dropdown.isDisplayed());

		System.out.println("is dropdown clickable or not? " + year_dropdown.isEnabled());

		System.out.println("is dropdown allow multiple selection? " + slt.isMultiple());

		System.out.println("Default selected option name: " + slt.getFirstSelectedOption().getText());

		slt.selectByIndex(1);
		//slt.selectByVisibleText("1916");

		System.out.println("Dropdown option selection based on index: " + slt.getFirstSelectedOption().getText());

		List<WebElement> options = slt.getOptions();

		System.out.println("Total number of options: " + options.size());
		for (int i = 0; i < options.size(); i++) {

		System.out.println(options.get(i).getText());
			
        

		}

	}
}

/*
 * TC4: https://demo.automationtesting.in/Register.html perform all possible
 * validation on year dropdown - visible - enable - default value - multiselect
 * check - select and validate - years are coming in ascending order
 */
