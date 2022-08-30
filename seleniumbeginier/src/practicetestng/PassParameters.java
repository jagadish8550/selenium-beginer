package practicetestng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class PassParameters {
	WebDriver driver;
	@Parameters(value = "browserName")
	@Test
	public void crossBrowserTest(String browserName) throws InterruptedException {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.switchTo().activeElement().sendKeys("selenium webdriver");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
