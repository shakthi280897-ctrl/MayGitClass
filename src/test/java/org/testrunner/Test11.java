package org.testrunner;

import org.testng.annotations.Test;

public class Test11 {

	@Test(groups = "smoke")
	public void tc1() {
		System.out.println("tc1");
	}

	@Test
	public void tc2() {
		System.out.println("tc2");
	}

	@Test
	public void tc3() {
		System.out.println("tc3");
	}

	@Test(groups = "smoke")
	public void tc4() {
		System.out.println("tc4");
	}

	@Test(groups = "smoke")
	public void tc5() {
		System.out.println("tc5");
	}

}
