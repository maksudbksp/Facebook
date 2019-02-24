package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Mynewwebsite {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/maksu/Desktop/WebSite/OurWebSite.html");

	}
	@Test(priority=1)
	public void GetTittle() {
		String Title=driver.getTitle();
		System.out.println("Title is:"+Title);
	}
	@Test(priority=2)
	public void GetUrl() {
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current Url is="+currentUrl);
	}
	@Test(priority=3)
	public void GetText() {
		String GetText=driver.findElement(By.xpath("html/body/marquee[1]")).getText();
		System.out.println("Text is=" +GetText);
	}
	@Test(priority=4)
	public void GetText1() {
		String GetText1=driver.findElement(By.xpath("html/body/marquee[2]")).getText();
		System.out.println("2nd text is:::::::" +GetText1);
		String Text="GetText1";
		System.out.println("Text1 will be written by upper case== " +GetText1.toUpperCase());
	}
	@Test(priority=5)
	public void GetText2() {
		String GetText2=driver.findElement(By.xpath("html/body/marquee[3]")).getText();
		System.out.println("3rd text is===="  +GetText2);
	}
	@Test(priority=6)
	public void VerifyEmage() {
		boolean img=driver.findElement(By.xpath("html/body/marquee[4]")).isDisplayed();
		if(img==true) {
			System.out.println("Image is Displayed");
		}else {
				System.out.println("image is not Displayed");
			}
		}
	@Test (priority=6)
	public void UserFirstName() {
		//driver.findElement(By.xpath("html/body/input[1]")).sendKeys("Maksud");
		driver.findElement(By.xpath(".//*[@id='FN']")).sendKeys("Makshud");
		String name="Makshud";
		System.out.println("MY FIRST NAME IS IN UPPER CASE::::" +name.toUpperCase());
		}
	@Test(priority=7)
	public void UserLastName() {
		driver.findElement(By.id("LN")).sendKeys("Islam");
	}
	@Test(priority=8)
	public void UserEmail() {
		driver.findElement(By.xpath("html/body/input[3]")).sendKeys("mak@gmail.com");
	}
	@Test(priority=9)
	public void RetypeEmail() {
		driver.findElement(By.xpath("html/body/input[4]")).sendKeys("mak@gmail.com");
	}
	@Test(priority=9)
	public void UserPassword() {
		driver.findElement(By.xpath("html/body/input[5]")).sendKeys("1234567");
	}
	@Test(priority=10)
	public void UserDOM() {
		Select DOM=new Select(driver.findElement(By.xpath("html/body/select[1]")));
		DOM.selectByVisibleText("Nov");
	}
	@Test(priority=11)
	public void UserDOB() {
		Select DOB=new Select(driver.findElement(By.xpath("html/body/select[2]")));
		DOB.selectByVisibleText("4");
	}
	@Test(priority=12)
	public void UserDOY() {
		Select DOY=new Select(driver.findElement(By.xpath("html/body/select[3]")));
		DOY.selectByVisibleText("2011");
	} @Test(priority=13)
	public void UserGender() {
		driver.findElement(By.xpath("html/body/input[6]")).click();
	}
	@Test(priority=14)
	public void GetOSdetails() {
		String OS=System.getProperty("os.name").toUpperCase();
		System.out.println("OPERATING SYSTEM IS===="  +OS);
	}
		@AfterTest
	public void teardown() throws InterruptedException{
		Thread.sleep(7000);
		driver.close();
	}
}
