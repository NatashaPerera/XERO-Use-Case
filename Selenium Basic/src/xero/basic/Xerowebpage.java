package xero.basic;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;


public class Xerowebpage {
	
	WebDriver driver;
	public void invokeBrowser(){
		
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://login.xero.com");
			driver.findElement(By.cssSelector("#email")).sendKeys("a.natashaperera@gmail.com");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#password")).sendKeys("Mit@4321");
			driver.findElement(By.cssSelector("#submitButton")).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > button.xui-button.xui-text-deemphasis.xui-margin-top-large.xui-button-borderless-main.xui-u-fullwidth")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#auth-splashpage > div > div > ol > li:nth-child(2) > button")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			

			
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > span")).getText().contains("What is your dream job?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > div > input")).sendKeys("Tour Guide");
			}
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > span")).getText().contains("What was your favourite place to visit as a child?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > div > input")).sendKeys("Japan");
			}
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > span")).getText().contains("What was the name of your first pet?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(1) > div > input")).sendKeys("Pickey");
			}
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > span")).getText().contains("What is your dream job?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > div > input")).sendKeys("Tour Guide");
			}
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > span")).getText().contains("What was your favourite place to visit as a child?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > div > input")).sendKeys("Japan");
			}
			if (driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > span")).getText().contains("What was the name of your first pet?"))
			{
				driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > label:nth-child(2) > div > input")).sendKeys("Pickey");
			}
			
			driver.findElement(By.cssSelector("#auth-splashpage > div > div > form > button.xui-button.xui-button-main.xui-u-fullwidth")).click();
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#text-1022-inputEl")).sendKeys("Telstra");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#industrysearchcombofield-1025-inputEl")).sendKeys("Telecommunication");
			List<WebElement> suggestion = driver.findElements(By.className("x-boundlist-item"));
			
			
			for(WebElement suggest : suggestion)
			{
				if(suggest.getText().equals("Wireless Telecommunications Activities"));
				suggest.click();
				break;
				
			}
			
			
			driver.findElement(By.cssSelector("#simplebutton-1035")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.findElement(By.id("#ext-gen1018")).click();;
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	public static void main(String[] args) {
		
		
		Xerowebpage myObj = new Xerowebpage();
		myObj.invokeBrowser();

	}
	
	
	

}
