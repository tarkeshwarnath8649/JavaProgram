package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationInTestNG {
	
	@Parameters({"url","env"})
	@Test
	public void useParameters(String url, String env) {
		System.out.println(url);
		System.out.println(env);
	}

}
