package ParallelExecution;

import org.testng.annotations.Test;

public class ConfigurationInTestNG_XML {
	
	
	@Test
	public void test1() {
		System.out.println(1+" : "+Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println(2+" : "+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println(3+" : "+Thread.currentThread().getId());
	}

}
