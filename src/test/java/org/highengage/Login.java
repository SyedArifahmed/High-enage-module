package org.highengage;

import java.util.Date;
import org.base.Base1;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login extends Base1 {
		
	@BeforeClass
	public void highenglogin() {

		openChrome();
		launchUr("https://www.highengage.com/register1/signup.html");
		maximizewindow();
		waiting(100);
	}

	@BeforeMethod
	public void timeStart() {
		Date dt = new Date();
		//long time = dt.getTime();
		System.out.println(dt);
		
	}
	@Test(priority =  1)
	public void login()  {
	toFilltxtboxbywait("id", "email", "proretension@gmail.com");
				toclickwait("xpath", "//input[@title='Get Started']");
	}
	@Test(priority =  2)
	public void about()  {
		toFilltxtboxbywait("id", "firstname", "Arif");
		toFilltxtboxbywait("id", "lastname", "Ahmed");
		toFilltxtboxbywait("id", "phone", "12345678910");
		toclickwait("xpath", "(//input[@type='submit'])[2]");
	}
	@Test(priority =  3)
	public void organization() throws Throwable {
		toFilltxtboxbywait("id", "organization", "Quscient");
		toclickwait("id", "employee");
		selectvisibilevalue(driver.findElement(By.id("employee")), "51 - 100");
		toFilltxtboxbywait("id", "title", "Software Testing");
		toFilltxtboxbywait("id", "domain", "quscient021444");
		toFilltxtboxbywait("id", "producturl", "abcr0087798");
		Thread.sleep(4000);
		toclickwait("id", "submit-form");

	}
	@AfterMethod
	public void timeEnd() {	
		Date dt = new Date();
		//long time = dt.getTime();
		System.out.println(dt);
		
	}
}
	
	
	