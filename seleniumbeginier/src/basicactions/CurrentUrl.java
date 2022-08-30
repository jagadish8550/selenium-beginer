package basicactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		//to get the url of active window
		String currentUrl = driver.getCurrentUrl();
		//print the captured url
		System.out.println(currentUrl);
		driver.quit();
	}

}
