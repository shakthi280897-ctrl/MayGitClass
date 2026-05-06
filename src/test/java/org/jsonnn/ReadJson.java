package org.jsonnn;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadJson {
public static void main(String[] args) throws IOException, ParseException {
		
		FileReader file=new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\Data.json");
	    
		JSONParser jsonparser=new JSONParser();
		
		Object json = jsonparser.parse(file);
		
		JSONObject root=(JSONObject) json;
		
		System.out.println(root.get("first_name"));
		System.out.println(root.get("last_name"));
		System.out.println(root.get("email"));
		
		Object person = root.get("personal");
		JSONObject personal=(JSONObject) person;
		
		
		System.out.println(personal.get("favorite_color"));
		System.out.println(personal.get("favorite_word"));
		System.out.println(personal.get("best_friend"));

		Object physical = personal.get("physical_features");		
		JSONObject physics=(JSONObject) physical;

        System.out.println(physics.get("eye_color"));
        System.out.println(physics.get("hair_color"));
        System.out.println(physics.get("gender"));
        
        Object obj3 = personal.get("courses");
        JSONArray course = (JSONArray) personal.get("courses");
        
        System.out.println(course.get(2));
        for(int i=0;i<course.size();i++) {
        	
        System.out.println(course.get(i));
        	
        }
	
	}

}
