package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankrate.com/");
	
		/*driver.findElement(By.id("u_0_c")).sendKeys("Mohammed");
		driver.findElement(By.name("lastname")).sendKeys("Islam");
		driver.findElement(By.name("reg_email__")).sendKeys("bksp@gmail");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(3);
		
		Select daySelect=new Select(driver.findElement(By.name("birthday_day")));
		daySelect.selectByValue("5");
		
		Select yearSelect=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		yearSelect.selectByVisibleText("1986");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		
		System.out.println("Facebook signUp Successfully");
		driver.close();
*/
	}

}
