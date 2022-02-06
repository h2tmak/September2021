package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://objectspy.space/");
	}
	@Test
	public void learnElementlocators() throws InterruptedException {
		
//		driver.findElement(By.name("firstname")).sendKeys("Selenium");
//		driver.findElement(By.className("input-file")).sendKeys("C:\\SDET-QA AUTOMATION\\Selenium");
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Product")).click();
		
		driver.findElement(By.cssSelector("input#sex-0")).click();
		driver.findElement(By.cssSelector("input[value='3']")).click();
		//driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Moga");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moga");
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		}

}
