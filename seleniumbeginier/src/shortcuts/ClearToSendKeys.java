package shortcuts;

import org.openqa.selenium.WebElement;

public class ClearToSendKeys {
	public static WebElement clearAndReturnElement(WebElement ele) {
		ele.clear();
		return ele;
	}
}
 