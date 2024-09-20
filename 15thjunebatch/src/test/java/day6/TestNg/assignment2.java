package day6.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class assignment2 extends SeleniumUtil {

	@Test
	public void testActitimeLoginLogout() {

		setUp("chrome", "https://online.actitime.com/qk/login.do");
		String expectedTitle = "actiTIME - Login";
		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	
	}

	@Test
	public void testOrangeHRMLoginLogout() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expectedTitle = "OrangeHRM";
		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		WebElement usernameinput = driver.findElement(By.name("username"));
		usernameinput.sendKeys("Admin");
		WebElement passwordinput = driver.findElement(By.name("password"));
		passwordinput.sendKeys("admin123");
		WebElement loginput = driver.findElement(By.className("orangehrm-login-button"));
		loginput.sendKeys(Keys.ENTER);
		WebElement dropdowninput = driver.findElement(By.className("oxd-userdropdown-tab"));
		dropdowninput.click();
		WebElement logoutinput = driver.findElement(By.linkText("Logout"));
		String expectedTitle1 = "OrangeHRM";
		String actualTitle1 = getCurrentPageTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		logoutinput.click();

	}

	@Test
	public void testVtigerLoginLogout() {
		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		String expectedTitle = "vtiger";
		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void testTricentisLoginLogout() {

		setUp("chrome", "https://demowebshop.tricentis.com/login");
		String expectedTitle = "Demo Web Shop. Login";
		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		WebElement usernameinput = driver.findElement(By.name("Email"));
		usernameinput.sendKeys("tester01@vomoto.com");
		WebElement passwordinput = driver.findElement(By.name("Password"));
		passwordinput.sendKeys("Abc@12345");
		WebElement loginput = driver.findElement(By.className("login-button"));
        loginput.sendKeys(Keys.ENTER);
		WebElement logoutinput = driver.findElement(By.className("ico-logout"));
		String expectedTitle1 = "Demo Web Shop";
		String actualTitle1 = getCurrentPageTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		logoutinput.click();

	}

}
