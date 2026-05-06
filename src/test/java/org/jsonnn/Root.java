package org.jsonnn;

import java.util.ArrayList;

public class Root {
	public Root(int id, String first_name, String last_name, String email, Personal personal,
			ArrayList<String> courses) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.personal = personal;
		this.courses = courses;
	}

	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private Personal personal;
	private ArrayList<String> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public ArrayList<String> getCourses() {
	    return courses;
	}

	public void setCourses(ArrayList<String> courses) {
	    this.courses = courses;
	}
}
