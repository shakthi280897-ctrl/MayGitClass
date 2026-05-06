package org.jsonnn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Serialization {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\sharmila.json");
		
		ArrayList<String> courses=new ArrayList<String>();
		
		courses.add("JAVA");		
		courses.add("Selenium");
		courses.add("Playwright");
		courses.add("GIT");
		courses.add("JENKINS");
		
		Personal personal=new Personal("Sharmila","Vedha","Sharon");
		
		Root root=new Root(1,"Sharmila","Devi","123@gmail.com",personal,courses);
		
		ObjectMapper obj=new ObjectMapper();
		
		obj.writeValue(file, root);
		
	}
}
