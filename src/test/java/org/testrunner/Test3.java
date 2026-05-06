package org.testrunner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FailureAll.class) 

public class Test3 {
	
	
	@Test
	public void tc3() {
		
		System.out.println("tc1");
		System.out.println("tc2");
		System.out.println("tc6");
		System.out.println("tc7");
		System.out.println("tc8");
	}

	@Test
	public void tc1() {
		
		System.out.println("tc3");
		Assert.assertTrue(false);
		System.out.println("tc4");
	}
	
}
