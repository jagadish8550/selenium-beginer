package dealingwithelemnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class Buttons {
	public static void main(String[] args) {
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.linkText("Button")).click();
		//find the go to home button and click on it
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Button")).click();
		//find the element and get its location in terms of (x,y) and print it
		System.out.println(driver.findElement(By.id("position")).getLocation());
		//find the css value(RGB) and print it
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		//find the size of the button in terms of height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		PostConditions.postConditions(driver);
	}
}
