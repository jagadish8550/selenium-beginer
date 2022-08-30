package testngintro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AfterClassAnnotation {
	//AfterClass annotation will be executed after all the methods in the class gets executed
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass annotation is executed");
	}
	@Test
	public void test() {
		System.out.println("Test annotation is executed");
	}
}
