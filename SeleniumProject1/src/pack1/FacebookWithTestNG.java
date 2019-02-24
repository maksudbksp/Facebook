package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookWithTestNG {


	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=2)
	public void EnterFirstName() {
		driver.findElement(By.id("u_0_c")).sendKeys("Mohammed");
	}
	@Test(priority=1)
	public void EnterLastName() {
		driver.findElement(By.name("lastname")).sendKeys("Islam");
	}
	@Test(priority=3)
	public void EnterEmail() {
		driver.findElement(By.name("reg_email__")).sendKeys("bksp@gmail.com");
	}
	@Test(priority=4)
	public void EnterAEmail() {
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bksp@gmail.com");
	}
	@Test(priority=5)
	public void EnterPassword() {
		driver.findElement(By.id("u_0_o")).sendKeys("123456");
	}
	@Test(priority=6)
	public void SelectMonth() {
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(3);
	}
	@Test(priority=7)
	public void SelectDay() {
		Select daySelect=new Select(driver.findElement(By.name("birthday_day")));
		daySelect.selectByValue("5");
	}
	@Test(priority=8)
	public void SelectYesr() throws InterruptedException {
		Select yearSelect=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		yearSelect.selectByVisibleText("1986");
		Thread.sleep(3000);
	}

	//driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
	@Test(priority=9)
	public void ClickOnMale() {
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
	}


	@AfterTest
	public void CloseBrowser() {
		driver.close();

	}

}
