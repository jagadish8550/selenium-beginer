package basicactions;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
public static void main(String[] args) {
	    //PRE CONDITION : to set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//instantiating the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//PRE CONDITION : to maximize the browser
		driver.manage().window().maximize();
}
}
