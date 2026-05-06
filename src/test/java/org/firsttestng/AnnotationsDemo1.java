package org.firsttestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* 1)Login - @BeforeMethod
 * 2)Search - @Test
 * 3)Logout - @AfterMethod
 * 4)Login 
 * 5)Advance Search - @Test
 * 6)Logout 
 */

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login() {
		System.out.println("This is Login");
	}
	@Test
	void Search() {
		System.out.println("This is Search");
	}
	@Test
	void advanceSearch() {
		System.out.println("Advance Search");
	}
	@AfterMethod
	 void logout() {
		 System.out.println("This is Logout");
	 }
	

}
