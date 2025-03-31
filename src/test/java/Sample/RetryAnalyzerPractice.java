package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice 
{
	@Test(retryAnalyzer=genericUtility.RetryAnalyserImplementation.class)
	public void sample() 
	{
		System.out.println("Hi");
		Assert.fail();
	}
}
