package dealingwithelemnts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcuts.Shortcuts;

public class ActiveElement {
	@Test
	public void activelement() throws InterruptedException {
		WebDriver driver = Shortcuts.preConditions();
		driver.get("https://google.com/");
		driver.switchTo().activeElement().sendKeys("latest selenium jar");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
