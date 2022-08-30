package basicactions;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {
	public static void main(String[] args) {
	    //PRE CONDITION : to set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//instantiating the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//PRE CONDITION : to maximize the browser
		driver.manage().window().maximize();
		//To pass the URL
		driver.get("https://www.amazon.in/");
		//to make window in fullScreen
		driver.manage().window().fullscreen();
		//to close the window
		//driver.close();
		//POST CONDITION : to quit the browser
		driver.quit();
	}
}
