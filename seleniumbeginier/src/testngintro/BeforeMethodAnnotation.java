package testngintro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAnnotation {
	//BeforeMethod annotation will execute the method before Test annotation
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod annotation is executed");
	}
	@Test
	public void test() {
		System.out.println("Test annotation is executed");
	}
}
