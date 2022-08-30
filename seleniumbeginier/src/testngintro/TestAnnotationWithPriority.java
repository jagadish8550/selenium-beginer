package testngintro;

import org.testng.annotations.Test;

//by providing priority parameter to Test annotation we can select the order of the method execution
public class TestAnnotationWithPriority {
	@Test(priority = 4)
	public void a() {
		System.out.println("a() has been executed");
	}
	@Test(priority = 2)
	public void d() {
		System.out.println("d() has been executed");
	}
	@Test(priority = 1)
	public void c() {
		System.out.println("c() has been executed");
	}
	@Test(priority = 3)
	public void b() {
		System.out.println("b() has been executed");
	}
}
