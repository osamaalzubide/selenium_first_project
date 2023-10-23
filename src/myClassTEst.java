import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myClassTEst {
	
	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void myBeforTest() {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("osama");
		driver.findElement(By.id("lastname")).sendKeys("AL-Zubaidi");
		driver.findElement(By.id("email_address")).sendKeys("test1231@gmail.com");
		driver.findElement(By.id("password")).sendKeys("osama@1234");
		driver.findElement(By.id("password-confirmation")).sendKeys("osama@1234");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

	}


	@Test()
	public void myTestOne() {
	}

@AfterTest
	public void myAfterTest() {
	}

}


