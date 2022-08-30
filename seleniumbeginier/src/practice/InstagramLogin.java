package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.ClearToSendKeys;
import shortcuts.PostConditions;

public class InstagramLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("someone@something.com");
		ClearToSendKeys.clearAndReturnElement(driver.findElement(By.name("password"))).sendKeys("Something");
		driver.findElement(By.xpath("//button[.='Show']"));
		driver.findElement(By.xpath("//button[.='Log In']")).submit();
		PostConditions.postConditions(driver);
	}

}
