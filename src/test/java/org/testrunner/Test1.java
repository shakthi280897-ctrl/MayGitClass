package org.testrunner;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({"email","password","topic"})
	@Test
	public void tc3(String username,String pass,String topics) {
		System.out.println(username);
		System.out.println(pass);
		System.out.println(topics);
		System.out.println("tc3");
	}

}
