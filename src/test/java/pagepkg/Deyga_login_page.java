package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deyga_login_page 
{
	WebDriver driver;
	By email=By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
	By password=By.xpath("//*[@id=\"customer_login\"]/div[2]/input");
	By login=By.xpath("//*[@id=\"customer_login\"]/button");
	
	public Deyga_login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String emailid, String pw)
	{
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(pw);
	}
	
	public void loginaccount()
	{
		driver.findElement(login).click();
	}

}
