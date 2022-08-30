package takingscreenshots;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;

public class WebElementScreeshot {

	public static void main(String[] args) throws Throwable {
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.consciousplanet.org/");
		WebElement saveSoilLogo1 = driver.findElement(By.cssSelector("[src='https://www.datocms-assets.com/60396/1646879557-save-soil.png?h=100&w=100']"));
		wait.until(ExpectedConditions.visibilityOf(saveSoilLogo1));
		File tempSS = saveSoilLogo1.getScreenshotAs(OutputType.FILE);
		File saveSoilLogo = new File("./errors/savesoillogo"+ldt+".png");
		Thread.sleep(2000);
		//FileUtils.copyFile(tempSS, saveSoilLogo);
		FileHandler.copy(tempSS, saveSoilLogo);
		driver.quit();
	}

}
