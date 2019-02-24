package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bankrateweb {
	WebDriver driver; 
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}			
	@Test
	public void clickMortgages() {
		driver.get("https://www.bankrate.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("MORTGAGES"))).build().perform();
		driver.findElement(By.linkText("Mortgage calculator")).click();
		//change home price
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).sendKeys("100000");
		//change deposit money
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input")).sendKeys("90000");
		
		//change years
		//driver.findElement(By.xpath(".//*[@id='text36']")).clear();
		//driver.findElement(By.xpath(".//*[@id='text36']")).sendKeys("20 Years");
		//
		Select yearselect=new Select(driver.findElement(By.xpath(".//*[@id='text36']")));
		
		yearselect.selectByVisibleText("20 Years");
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/input")).sendKeys("4.13");
		
		}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
	
		
		
		//driver.findElement(By.xpath(".//*[@id='csstyle']/div[2]/header/nav/ul/li[1]/a")).click();
		
	
		//driver.findElement(By.className("global-navigation__horizontal-subnav-item-container")).click();
	
	}


