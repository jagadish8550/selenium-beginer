package practicetestng;

import org.testng.annotations.Test;

//If priority is not given to some methods and priority is given to some other method, the methods without priority gets executed first
public class TestAnnotationWithAndWithoutPriority {
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
	
	//method without priority(This gets executed first)
	@Test
	public void b() {
		System.out.println("b() has been executed");
	}
}
