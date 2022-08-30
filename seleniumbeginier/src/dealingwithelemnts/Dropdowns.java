package dealingwithelemnts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.linkText("Drop down")).click();
		//create a Select class Object for the dropdown by passing the webelement
		Select selectUsingIndexDropdown = new Select(driver.findElement(By.id("dropdown1")));
		//select using index
		selectUsingIndexDropdown.selectByIndex(3);
		Select selectUsingTextDropdown = new Select(driver.findElement(By.name("dropdown2")));
		//select using text
		selectUsingTextDropdown.selectByVisibleText("Appium");
		Select selectUsingValueDropdown = new Select(driver.findElement(By.id("dropdown3")));
		//select using value attribute
		selectUsingValueDropdown.selectByValue("2");
		Select selectUsingOptionsDropdown = new Select(driver.findElement(By.className("dropdown")));
		//store all the options in the dropdown
		List<WebElement> alloptions = selectUsingOptionsDropdown.getOptions();
		//print the number of options in the dropdown
		System.out.println(alloptions.size());
		//to select an option in dropdown with sendKeys
		driver.findElement(By.xpath("//option[.='You can also use sendKeys to select']/..")).sendKeys("Selenium");
		Select multiSelectDropdown = new Select(driver.findElement(By.xpath("//option[.='Select your programs']/..")));
		if (multiSelectDropdown.isMultiple()) {
			System.out.println("last dropdown is a multiselect dropdown");
			//selecting multiple options in the multiSelectDropdown
			multiSelectDropdown.deselectByIndex(1);
			multiSelectDropdown.deselectByValue("2");
			multiSelectDropdown.deselectByVisibleText("UFT/QTP");
		}
		else
			System.out.println("last dropdown is a single select dropdown");
		PostConditions.postConditions(driver);
	}
}
