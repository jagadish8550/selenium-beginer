package basicactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		//to get the window ID and store it
		String windowID = driver.getWindowHandle();
		//print the windowID
		System.out.println(windowID);
		Thread.sleep(2000);
		driver.quit();
	}

}
