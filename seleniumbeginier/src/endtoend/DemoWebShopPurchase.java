package endtoend;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import shortcuts.BrowserPreConditions;
import shortcuts.PostConditions;

public class DemoWebShopPurchase {
	public static void main(String[] args) {
		WebDriver driver = BrowserPreConditions.preConditions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aadhi");
		driver.findElement(By.id("LastName")).sendKeys("Adityan");
		driver.findElement(By.id("Email")).sendKeys("aadhiadityan812@somemail.com");
		driver.findElement(By.id("Password")).sendKeys("jagadish");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("jagadish");
		driver.findElement(By.id("register-button")).submit();
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("aadhiadityan812@somemail.com");
		driver.findElement(By.id("Password")).sendKeys("jagadish");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.partialLinkText("Genuine Leather Handbag")).click();
		driver.findElement(By.id("add-to-cart-button-29")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("termsofservice"))));
		driver.findElement(By.id("checkout")).click();
		Select select=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		select.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bangaore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("No 21, Malleshwaram");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560001");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("8057345459");
		driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]//input")).click();
		driver.findElement(By.xpath("//div[@id=\"shipping-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input")).click();
		driver.findElement(By.id("paymentmethod_2")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,400);");
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input")).click();
		Select sel=new Select(driver.findElement(By.id("CreditCardType")));
		sel.selectByVisibleText("Visa");
		driver.findElement(By.id("CardholderName")).sendKeys("Aadhi");
		driver.findElement(By.id("CardNumber")).sendKeys("456594658463956");
		Select expireMonth=new Select(driver.findElement(By.id("ExpireMonth")));
		expireMonth.selectByVisibleText("05");
		Select expireYear=new Select(driver.findElement(By.id("ExpireYear")));
		expireYear.selectByVisibleText("2027");
		driver.findElement(By.id("CardCode")).sendKeys("748");
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();
		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input")).click();
		String orderDetails=driver.findElement(By.xpath("//div[@class=\"section order-completed\"]/ul/li[1]")).getText();
		driver.findElement(By.linkText("Click here for order details.")).click();
		driver.findElement(By.linkText("PDF Invoice")).click();
		System.out.println(orderDetails);
		System.out.println("Check Your Downloads folder for pdf invoice named with the above order number");
		driver.findElement(By.linkText("Log out")).click();
		PostConditions.postConditions(driver);
	}
	}