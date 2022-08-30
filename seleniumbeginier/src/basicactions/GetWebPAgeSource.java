package basicactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebPAgeSource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		//to get twitter webpage source
		String wePageSource = driver.getPageSource();
		//print the captured source
		System.out.println(wePageSource);
		driver.quit();
	}
}
