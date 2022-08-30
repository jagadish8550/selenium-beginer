package shortcuts;

import org.openqa.selenium.WebDriver;

public class PostConditions {
	public static void postConditions(WebDriver driver) {
		driver.manage().window().minimize();
		driver.quit();
	}
}
