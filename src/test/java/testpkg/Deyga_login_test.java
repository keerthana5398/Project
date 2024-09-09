package testpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Deyga_login_page;


public class Deyga_login_test 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();	
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://deyga.in/account/login");
	}
	@Test
	public void loginTest()
	{
		Deyga_login_page dl=new Deyga_login_page(driver);
		dl.setvalues("keerthnaknair98@gmail.com", "abcd@1234");
		dl.loginaccount();
	}
	

}
