package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PCHOTCOM {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.pch.com/");
		//click registration
		driver.findElement(By.xpath(".//*[@id='uni_header']/div/div/div[1]/div[2]/div/nav/ul/li[2]/a")).click();
		//Enter Title
		Select titleSelect=new Select(driver.findElement(By.xpath(".//*[@id='TI']")));
		titleSelect.selectByVisibleText("Mr.");
		//Enter FirstName
		driver.findElement(By.id("FN")).sendKeys("Mohammed");
		
		//Enter LastName
		driver.findElement(By.name("LN")).sendKeys("Ataur");
		//Enter StreetAddress
		driver.findElement(By.xpath(".//*[@id='A1']")).sendKeys("jaimaica");
		
		//Enter ZipCode
		driver.findElement(By.id("ZI")).sendKeys("2345");
		//Enter Apt
		driver.findElement(By.id("A2")).sendKeys("148 -a");
		//Enter City
		driver.findElement(By.xpath(".//*[@id='CI']")).sendKeys("queens");
		//SelectState
		Select stateSelect=new Select(driver.findElement(By.id("ST")));
		stateSelect.selectByVisibleText("New York");
		//SelectMonth
		Select monthSelect=new Select(driver.findElement(By.name("MN")));
		monthSelect.selectByVisibleText("February");
		//SelectDay
		Select daySelect=new Select(driver.findElement(By.id("DY")));
		daySelect.selectByValue("2");
		//SelectYear
		Select yearSelect=new Select(driver.findElement(By.xpath(".//*[@id='YR']")));
		yearSelect.selectByVisibleText("2008");
		//EnterEmail
		driver.findElement(By.id("EM")).sendKeys("www.rahman");
		//EnterConfirmEmail
		driver.findElement(By.xpath(".//*[@id='CE']")).sendKeys("www.rahman");
		Thread.sleep(2000);



	}

}
