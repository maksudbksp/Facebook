package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Framework1 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dataProvider="facebookdata")
	public void FaceBooksignup(String FN, String LN, String EM, String CEM, String PASS, String DOM, String DOB, String DOY) throws Exception {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_c")).sendKeys(FN);
	
		driver.findElement(By.name("lastname")).sendKeys(LN);
	
		driver.findElement(By.name("reg_email__")).sendKeys(EM);
	
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(CEM);
	
		driver.findElement(By.id("u_0_o")).sendKeys(PASS);
	
		Select monthSelect=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		monthSelect.selectByVisibleText(DOM);
	

		Select daySelect=new Select(driver.findElement(By.name("birthday_day")));
		daySelect.selectByValue(DOB);
	
		Select yearSelect=new Select(driver.findElement(By.name("birthday_year")));
		yearSelect.selectByVisibleText(DOY);
		Thread.sleep(3000);
		//if(SEX.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		}
		//else if(SEX.equalsIgnoreCase("Female")) {
		//	driver.findElement(By.id(".//*[@id='u_0_9']")).click();
		
	
	


	@AfterTest
	public void CloseBrowser() {
		driver.close();

	}
	@DataProvider(name="facebookdata")
	public Object[][] getData(){
		//Object[][] obj=null;
		return new Object[][] {
			{"Mohammed", "Islam", "bksp@gmail.com","bksp@gmail.com","123456","Jun","5", "1986"},
			{"Safi","md","safi@gamil.com","safi@gmail.com","6785","Mar","9","1990"},
			
		};
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



