package org.testrunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailureAll implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {

        if (testMethod != null) {  // ✅ important check

            Class<? extends IRetryAnalyzer> r = annotation.getRetryAnalyzerClass();

            if (r == null) {
                annotation.setRetryAnalyzer(FailureClass.class);
                System.out.println("Retry applied to: " + testMethod.getName());
            }
        }
    }
}