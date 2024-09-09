package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deyga_register_page 
{
	WebDriver driver;
	By fname=By.xpath("//*[@id=\"create_customer\"]/div[1]/input");
	By lname=By.xpath("//*[@id=\"create_customer\"]/div[2]/input");
	By demail=By.xpath("//*[@id=\"create_customer\"]/div[3]/input");
	By dpw=By.xpath("//*[@id=\"create_customer\"]/div[4]/input");
	By create=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public Deyga_register_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String firstname,String lastname, String emailid, String password)
	{
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
		driver.findElement(demail).sendKeys(emailid);
		driver.findElement(dpw).sendKeys(password);
	}
	
	public void register()
	{
		driver.findElement(create).click();
	}

}
