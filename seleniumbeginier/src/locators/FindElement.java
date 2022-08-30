package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
	    //PRE CONDITION : to set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//instantiating the chrome browser
		WebDriver driver = new ChromeDriver();
		//PRE CONDITION : to maximize the browser
		driver.manage().window().maximize();
		driver.get("");
}

}
