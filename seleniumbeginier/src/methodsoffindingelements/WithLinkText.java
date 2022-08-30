package methodsoffindingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithLinkText {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//to find element using link text
		WebElement linkText = driver.findElement(By.linkText("/shop/home-living"));
		//to click on the element
		linkText.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
