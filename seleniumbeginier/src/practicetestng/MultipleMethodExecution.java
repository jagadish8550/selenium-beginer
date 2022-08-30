package practicetestng;

import org.testng.annotations.Test;

//when we use Test annotation on multiple methods it executes all the methods in alphabetical order
public class MultipleMethodExecution {
@Test
public void a() {
	System.out.println("a() has been executed");
}
@Test
public void d() {
	System.out.println("d() has been executed");
}
@Test
public void c() {
	System.out.println("c() has been executed");
}
@Test
public void b() {
	System.out.println("b() has been executed");
}
}
