package takingscreenshots;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class ActionNowButtonConciousPlanet {
	public static void main(String[] args) throws Throwable {
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.consciousplanet.org/");
		File tempSS = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]")).getScreenshotAs(OutputType.FILE);
		File actionButton = new File("./errors/actionnowbutton"+ldt+".png");
		FileUtils.copyFile(tempSS, actionButton);
		PostConditions.postConditions(driver);
	}
}
