package testngintro;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAnnotation {
	//BeforeClass annotation executes before all the methods in the class
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass annotaion is executed");
	}
	@Test
	public void test() {
		System.out.println("Test annotation is executed");
	}
}
