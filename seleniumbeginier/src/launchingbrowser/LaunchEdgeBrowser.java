package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://developer.microsoft.com/");
	Thread.sleep(2000);
	driver.quit();
}
}
