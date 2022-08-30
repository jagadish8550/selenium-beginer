package practicetestng;

import org.testng.annotations.Test;

public class TestNgUsingXml {
	@Test(groups = "functionalTesting")
	public void a() {
		System.out.println("a() has been executed");
	}
	@Test(groups = "integrationTesting")
	public void d() {
		System.out.println("d() has been executed");
	}
	@Test(groups = "systemTesting")
	public void c() {
		System.out.println("c() has been executed");
	}
	@Test(groups = "integrationTesting")
	public void b() {
		System.out.println("b() has been executed");
	}
	@Test(groups = "functionalTesting")
	public void e() {
		System.out.println("e() has been executed");
	}
	
	//right click on this class from project explorer ----> TestNG ----> Convert to TestNG
	/*use the xml code like below and modify the xml file :
  <groups>
  <run>
  <include name="functionalTesting"/>
  <include name="systemTesting"/>
  <exclude name="integrationTesting"/>
  </run>
  </groups>
	 */
}
