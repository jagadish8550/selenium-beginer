package launchingbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

public static void main(String[] args) {
	//to set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//instantiating the chrome browser
	ChromeDriver driver = new ChromeDriver();
}
}
