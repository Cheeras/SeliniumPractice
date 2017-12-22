
package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void test1(){
		//Assert.assertEquals(12, 12);//in case of hard assertion if validation fails at this 
		//place it will not execute next subsequent java code it will simply skip the rest of test case
		String str = "Shankar Cheerala";
		Assert.assertTrue(str.contains("Sharkar"),"Name are not matching..");
		System.out.println("From test case 1 ....");
	}
	@Test
	public void test2(){
		System.out.println("Test case-2 Started...");
		
		Assert.assertEquals(12, 12,"Drop down count does not match please check with developer");
		
		System.out.println("Test case2 ended");
		
	}
	
	@Test
	public void test3(){
		System.out.println("Test case-3 Started...");
		
		Assert.assertEquals("Hello", "Hello","Words does not match please raise bug");
		
		System.out.println("Test case-3 ended.");
		
	}
	
	
}
