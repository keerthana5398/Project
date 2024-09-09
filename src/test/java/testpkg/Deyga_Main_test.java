package testpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Deyga_Main_test 
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
		driver.get("https://deyga.in/");
	}
	@Test
	public void maintest() throws IOException
	{
		driver.manage().window().maximize();
		// verify logo
		WebElement src=driver.findElement(By.xpath("//*[@id=\"Header__Wrapper\"]/div[3]/h1/a/img"));
		Boolean b=src.isDisplayed();
		if(b)
		{
			System.out.println("Brand Logo is dispalyed");
		}
		else
		{
			System.out.println("Brand Logo not displayed");
		}
		
		// take screenshot
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D://deygaimage.png"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"Header__Wrapper\"]/div[2]/nav/ul/li[2]/a"));
		Actions act=new Actions(driver);
	    act.moveToElement(ele);
	    act.perform();
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Header__Wrapper\"]/div[2]/nav/ul/li[2]/div/div/div[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"Header__Wrapper\"]/div[2]/nav/ul/li[2]/div/div/div[1]/ul/li[1]/a")).click();
		// shop now
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16925772513474__main\"]/section/a[1]/div/img")).click();
		// add to cart
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16925773398210__main\"]/section/div[1]/div[2]/div/div[3]/button")).click();
		driver.navigate().back();
		
		//scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"section-footer\"]/div[2]/div[2]/div[2]/ul/li[3]/a")).click();
		driver.navigate().back();
		//search for product
	    driver.findElement(By.xpath("//*[@id=\"search-desktop\"]/input")).sendKeys("haircare",Keys.ENTER);
	    
	    
	    
	    
	    	       
	    	    
	  }
	    	

	     
		
}


