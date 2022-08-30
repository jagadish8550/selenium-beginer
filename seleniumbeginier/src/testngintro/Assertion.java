package testngintro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcuts.Shortcuts;

@Test
public class Assertion {
	public void assertionCheck() {
		WebDriver driver = Shortcuts.preConditions();
		driver.get("http://demowebshop.tricentis.com/");
		assertEquals("http://demowebshop.tricentis.co/",driver.getCurrentUrl());
		Shortcuts.postConditions(driver);
	}
}
