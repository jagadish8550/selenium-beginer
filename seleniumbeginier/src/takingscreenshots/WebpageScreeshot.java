package takingscreenshots;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;

public class WebpageScreeshot {

	public static void main(String[] args) throws Throwable {
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.consciousplanet.org/");
		driver.findElement(By.cssSelector("div[class='chakra-stack css-18bl49t']")).findElement(By.linkText("About")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempSS = ts.getScreenshotAs(OutputType.FILE);
		File saveSoilSS = new File("./errors/savesoilabout"+ldt+".png");
		FileUtils.copyFile(tempSS, saveSoilSS);
		driver.quit();
	}

}
