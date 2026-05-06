package org.jsonnn;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		
		FileReader file=new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\Data.json");
		
		ObjectMapper obj=new ObjectMapper();
				Root readvalue = obj.readValue(file, Root.class);		
		System.out.println(readvalue.getFirst_name());
		System.out.println(readvalue.getLast_name());
		System.out.println(readvalue.getEmail());
		System.out.println(readvalue.getId());
				
		Personal p=readvalue.getPersonal();
		
		System.out.println(p.getBest_friend());
		System.out.println(p.getFavorite_color());
		System.out.println(p.getFavorite_word());

		
		ArrayList<String> courses=readvalue.getCourses();
		for(int i=0;i<courses.size();i++) {
			
			System.out.println(courses.get(i));
		}
	}
	
	
	
	
}
