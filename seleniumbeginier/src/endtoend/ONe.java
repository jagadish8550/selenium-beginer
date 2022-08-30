package endtoend;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;

public class ONe {
public static void main(String[] args) throws Throwable {
	WebDriver driver = BrowserPreConditions.preConditions();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("aadhiadityan@somemail.com");
	driver.findElement(By.id("Password")).sendKeys("jagadish");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	//driver.findElement(By.linkText("14.1-inch Laptop")).click();
	//driver.findElement(By.id("add-to-cart-button-31")).click();
	driver.findElement(By.linkText("Shopping cart")).click();
	WebElement chckBox = driver.findElement(By.id("termsofservice"));
	chckBox.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementSelectionStateToBe(chckBox, true));
	driver.findElement(By.id("checkout")).click();
	//driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	 /*LocalDateTime ldt = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	String formatDateTime = ldt.format(format).replace('-', '/');
	System.out.println(formatDateTime);*/
}
}
