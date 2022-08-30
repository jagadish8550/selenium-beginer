package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;

public class UsageOfImplicitAndExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=BrowserPreConditions.preConditions();
		driver.get("https://trello.com/en");
		//implicit wait condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait condition
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		WebElement loginForm = driver.findElement(By.id("login-form"));
		WebElement loginPageUsnTextField = loginForm.findElement(By.id("user"));
		loginPageUsnTextField.clear();
		loginPageUsnTextField.sendKeys("peoplefortiptur@gmail.com");
		loginForm.findElement(By.id("login")).click();
		WebElement passwordLoginForm = driver.findElement(By.id("form-login"));
		WebElement passwordTextField = passwordLoginForm.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("9886947924");
		passwordLoginForm.findElement(By.cssSelector("span[role='presentation']")).click();
		passwordLoginForm.findElement(By.id("login-submit")).submit();
		wait.until(ExpectedConditions.urlContains("boards"));
		driver.findElement(By.cssSelector("div[title='James']")).click();
		//wait until the condition is satisfied
		wait.until(ExpectedConditions.titleContains("James"));
		wait.until(ExpectedConditions.urlContains("james"));
		WebElement jamesBoardName = driver.findElement(By.xpath("//h1[.='James']"));
		WebElement pftMenuIcon = driver.findElement(By.cssSelector("span[title='pft pft (pftpft1)']"));
		if(jamesBoardName.isDisplayed()) {
			if(pftMenuIcon.isDisplayed()) {
				pftMenuIcon.click();
			}
			else {
				System.out.println("pft menun icon is not displayed");
			}
		}
		else {
			System.out.println("james Board name is not displayed.");
		}
		driver.findElement(By.xpath("//button[.='Log out']")).click();
		driver.findElement(By.id("logout-submit")).submit();
		wait.until(ExpectedConditions.urlContains("home"));
		driver.quit();
	}

}