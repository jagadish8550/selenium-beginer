package basicactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		WebElement usnTextField = driver.findElement(By.id("session_key"));
		usnTextField.sendKeys("9057536554");
		Thread.sleep(2000);
		WebElement pwdTextFiled = driver.findElement(By.id("session_password"));
		pwdTextFiled.sendKeys("hkdGhdggfg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section/div/div/form/button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
