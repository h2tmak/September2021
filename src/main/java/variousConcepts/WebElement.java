package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	WebDriver driver;
	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		driver.findElement(By.xpath("//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[2]/h3/a/span[2]/strong")).click();
		
		
	}

}
