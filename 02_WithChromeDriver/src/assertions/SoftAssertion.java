package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * In Softassertion if any validation fails it will continue rest of the script once if script completes 
 * it fails the test.
 * But in case of the HardAssert if the validation fails it will not execute rest of the script and 
 * it will fail the script
 * */
public class SoftAssertion {
	@Test
	public void test1(){
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(10,20);
		System.out.println("From test case1 ....");
		softassert.assertAll(); //if you forgot to call assertAll() even in assertion fails it will pass the test case
	}
	@Test
	public void test2(){
		Assert.assertTrue(true);
		System.out.println("test2 completed");
	}
}
