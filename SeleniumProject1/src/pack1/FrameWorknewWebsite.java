package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrameWorknewWebsite {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","D://ITTraning//AllDriver//chromedriver.exe");
		//D:\\ITTraning\\AllDriver\\chromedriver.exe
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test(dataProvider="website")
	public void websitesignup(String FN, String LN, String EM,String REEM, String PASD, String DOM, String DOB, String DOY) {
		driver.get("file:///C:/Users/maksu/Desktop/WebSite/OurWebSite.html");
		driver.findElement(By.xpath(".//*[@id='FN']")).sendKeys(FN);
		driver.findElement(By.id("LN")).sendKeys(LN);
		driver.findElement(By.xpath("html/body/input[3]")).sendKeys(EM);
		driver.findElement(By.xpath("html/body/input[4]")).sendKeys(REEM);
		driver.findElement(By.xpath("html/body/input[5]")).sendKeys(PASD);
		Select month=new Select(driver.findElement(By.xpath("html/body/select[1]")));
		month.selectByVisibleText(DOM);
		Select day=new Select(driver.findElement(By.xpath("html/body/select[2]")));
		day.selectByVisibleText(DOB);
		Select year=new Select(driver.findElement(By.xpath("html/body/select[3]")));
		year.selectByVisibleText(DOY);
		driver.findElement(By.xpath("html/body/input[6]")).click();
		}
	@AfterTest
	public void closebrower() {
		driver.close();
	}
	@DataProvider(name="website")
	public Object[][]getdata(){
		return new Object[][] {
			{"Mohammed", "Islam", "bksp@gmail.com","bksp@gmail.com","123456","Jun","5","2011"},
			{"Safi","md","safi@gamil.com","safi@gmail.com","6785","Mar","6","2015"},
			{"kakaks", "wgtdvd", "gdgdh@gmail", "gdgdh@gmail", "9999","Jan","3","2015"},
		
	};
	}
	}


