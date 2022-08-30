package shortcuts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shortcuts {
	public static WebDriver preConditions() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void postConditions(WebDriver driver) {
		driver.manage().window().minimize();
		driver.quit();
	}
	public static WebElement clearAndReturnElement(WebElement ele) {
		ele.clear();
		return ele;
	}
	public static WebDriverWait wait(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return new WebDriverWait(driver, Duration.ofSeconds(time));
	}
	
}
