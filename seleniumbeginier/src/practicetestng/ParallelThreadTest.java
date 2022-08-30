package practicetestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcuts.Shortcuts;

public class ParallelThreadTest {
	//executes the test case twice at the same time but in two instances
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void parallelTest() {
		WebDriver driver=Shortcuts.preConditions();
		driver.get("https://facebook.com/");
		Shortcuts.postConditions(driver);
	}
}
