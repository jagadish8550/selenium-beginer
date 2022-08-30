package basicactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfWebPage {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//to get the title of current page
	String titleOfWebPage = driver.getTitle();
	//print the captured title
	System.out.println(titleOfWebPage);
	Thread.sleep(2000);
	driver.quit();
}
}
