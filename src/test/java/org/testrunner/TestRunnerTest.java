package org.testrunner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRunnerTest {
	@Test(enabled = false)
    public void tc3() {
        System.out.println("tc3");
    }

    @Test
    public void tc1() {
        System.out.println("tc1");

        String s = "welcome";
        Assert.assertEquals("welcome",s, "Validate successfully");

        System.out.println("Success");
    }

    @Test(enabled = false)
    public void tc2() {
        System.out.println("tc2");
    }
}
