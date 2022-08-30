package testngintro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AfterMethodAnnotation {
	//AfterMethod annotation will be executed after the Test annotation
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod annotation is executed");
		}
	@Test
	public void test() {
		System.out.println("Test annotation is executed");
	}
}
