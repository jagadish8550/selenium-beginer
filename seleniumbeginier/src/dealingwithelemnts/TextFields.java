package dealingwithelemnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class TextFields {
	public static void main(String[] args) {
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.linkText("Edit")).click();
		//find the email text field and enter the email
		driver.findElement(By.id("email")).sendKeys("someone@somthing.com");
		//find the append text field and append some text
		driver.findElement(By.xpath("//label[.='Append a text and press keyboard tab']/../descendant::input[contains(@type,'text')]")).sendKeys("HEY");
		//to find the text field and get its current value(text present inside the text field)
		System.out.println("usnText: "+driver.findElement(By.xpath("//label[.='Get default text entered']/../descendant::input[contains(@type,'text')]")).getAttribute("value"));
		//to find the text field and clear text present in it
		driver.findElement(By.xpath("//label[.='Clear the text']/../descendant::input[contains(@type,'text')]")).clear();
		//find and store the text field
		WebElement disabledTextField = driver.findElement(By.xpath("//label[.='Confirm that edit field is disabled']/../descendant::input[contains(@type,'text')]"));
		//to check if the text field is enables or disabled
		if(disabledTextField.isEnabled())
			System.out.println("this TextField is enabled");
		else
			System.out.println("this TextField is disabled");
		PostConditions.postConditions(driver);
	}
}
