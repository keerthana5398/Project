package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Deyga_register_page;

public class Deyga_register_test 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://deyga.in/account/register");
	}
	@Test
	public void registertest()
	{
		
		Deyga_register_page ob=new Deyga_register_page(driver);
		ob.setvalues("keerthana", "k", "keerthnaknair98@gmail.com", "abcd@1234");
		ob.register();
	}
}
