package day5Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));
  driver.get("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=topnav_storetab_gc_subnav_mainstore");
 // driver.findElement(By.cssSelector("#nav-subnav > a.nav-a.nav-b > span"));
  driver.findElement(By.xpath("li[span[a[div[label[span[span[text()='Anniversary']]]]]]]/span/a/div/label/i")).click();
		
	}

}
