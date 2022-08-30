package methodsoffindingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithName {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		//to find usn TF using name(priority must be given to id if present.)
		WebElement usnTF = driver.findElement(By.name("session_key"));
		//to enter the data into usn TF
		usnTF.sendKeys("someone@something.com");
		Thread.sleep(3000);
		//to find pwd TF using name and enter the pwd(priority must be given to id if present.)
		driver.findElement(By.name("session_password")).sendKeys("Something$143");
		Thread.sleep(3000);
		driver.quit();
	}

}
