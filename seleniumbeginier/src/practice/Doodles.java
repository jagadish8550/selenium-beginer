package practice;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class Doodles {
	public static void main(String[] args) throws Throwable {
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(;;) {
		try {
			driver.findElement(By.linkText("Dragon Boat Festival 2022")).click();
			break;
			} catch (NoSuchElementException e) {
			jse.executeScript("window.scrollBy(0,250);");
		}
		}
		File tempSS = driver.findElement(By.id("hplogo-img")).getScreenshotAs(OutputType.FILE);
		File hippoDoodle=new File("./errors/hippoDoodle"+ldt+".png");
		FileUtils.copyFile(tempSS, hippoDoodle);
		PostConditions.postConditions(driver);
	}
}
