package basicactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageNavigation {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		Thread.sleep(2000);
		driver.get("https://www.wionews.com/");
		Thread.sleep(2000);
		//to navigate back to previously loaded page
		driver.navigate().back();
		Thread.sleep(2000);
		//to navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//to refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
