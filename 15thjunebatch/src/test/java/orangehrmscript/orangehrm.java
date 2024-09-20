package orangehrmscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class orangehrm extends SeleniumUtil {

	public static void main(String[] args) {
		//launching Application Website
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login with Username & Password
		WebElement usernameinput = driver.findElement(By.name("username"));
		usernameinput.sendKeys("Admin");
		WebElement passwordinput = driver.findElement(By.name("password"));
		passwordinput.sendKeys("admin123");
		WebElement loginput = driver.findElement(By.className("orangehrm-login-button"));
		loginput.sendKeys(Keys.ENTER);
		//Click on PIM
		WebElement leftpanner = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		leftpanner.click();
		//click on ADD Employee
		WebElement addemployeebtton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
		addemployeebtton.click();
		//fill Required information
		WebElement employeefirstname=driver.findElement(By.name("firstName"));
		employeefirstname.sendKeys("shraddha");
		WebElement employeelastname=driver.findElement(By.name("lastName"));
		employeelastname.sendKeys("kale");
        WebElement employeeid=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		employeeid.clear();
		//employeeid.sendKeys("0811");
		//Click on save button
		WebElement savebtton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		savebtton.click();
		//click on PIM
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		//click on 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("0425");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]/i")).click();
		driver.findElement(By.linkText("Job")).click();
		WebElement jobtitledropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		jobtitledropdown.click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//span[text()='Automaton Tester']")));
		WebElement Autmationtester = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Automaton Tester']"));
		Autmationtester.click();
		WebElement editsavebutton= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button"));
		editsavebutton.click();
	//	String expectedjobtitle= "Automation Tester";
		
	}
	

}

