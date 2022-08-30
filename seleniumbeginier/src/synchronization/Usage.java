package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//to provide wait time for
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Test@123");
		driver.findElement(By.xpath("//button[.='Sign in']")).submit();
	}
}
