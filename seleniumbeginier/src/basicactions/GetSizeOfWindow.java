package basicactions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfWindow {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		//to get the size of the window and store it -- hieght and width in pixels
		Dimension size = driver.manage().window().getSize();
		//print the size of window
		System.out.println(size);
		Thread.sleep(2000);
		driver.quit();
	}

}
