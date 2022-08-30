package practicetestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcuts.Shortcuts;

public class TimeSpecificTestCaseTest {
	//to set time boundary to the test case to be executed. if not executed in the given time test case fails
	@Test(timeOut = 5000)
	public void timeOutTest() {
		WebDriver driver = Shortcuts.preConditions();
		driver.get("htpps://facebook.com/");
		Shortcuts.postConditions(driver);
	}
}
