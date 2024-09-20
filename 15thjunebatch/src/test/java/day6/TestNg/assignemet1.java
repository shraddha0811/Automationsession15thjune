package day6.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class assignemet1 extends SeleniumUtil {
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

		 
	}

}
