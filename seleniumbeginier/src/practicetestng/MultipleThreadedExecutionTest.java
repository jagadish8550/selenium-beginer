package practicetestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcuts.Shortcuts;

public class MultipleThreadedExecutionTest {
	//to execute the testcase twice one after the other
	@Test(invocationCount = 2)
	public void parallelExecutionTest() {
		WebDriver driver = Shortcuts.preConditions();
		driver.get("https://facebook.com/");
		Shortcuts.postConditions(driver);
	}
}
