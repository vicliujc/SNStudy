package com.vic.bean;

public class Student {
	private String name;
    
	public Student() {
		System.out.println("student come to school...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
