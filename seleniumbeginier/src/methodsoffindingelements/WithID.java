package methodsoffindingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithID {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		//to find USN text field use id
		WebElement usnTF = driver.findElement(By.id("username"));
		//to enter the data to usn text field
		usnTF.sendKeys("someone@something.com");
		Thread.sleep(3000);
		//to find password text field and enter the password 
		driver.findElement(By.id("password")).sendKeys("Something$143");
		Thread.sleep(3000);
		driver.quit();
	}

}
