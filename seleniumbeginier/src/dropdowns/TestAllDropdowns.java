package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.Shortcuts;

public class TestAllDropdowns {

	public static void main(String[] args) {
		WebDriver driver = Shortcuts.preConditions();
		WebDriverWait wait = Shortcuts.wait(driver, 10);
		driver.get("https://www.facebook.com/signup/");
		Select monthOptions= new Select(driver.findElement(By.id("month")));
		List<WebElement> allMonthOptions = monthOptions.getOptions();
		for (WebElement month : allMonthOptions) {
			String monthName = month.getText();
			monthOptions.selectByVisibleText(monthName);
			if (month.isSelected()) {}
			else
				System.out.println(month+" is not selected");
		}
		Shortcuts.postConditions(driver);
	}

}
