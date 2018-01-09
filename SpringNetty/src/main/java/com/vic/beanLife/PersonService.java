package com.vic.beanLife;

public class PersonService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("hi "+name);
	}

}
