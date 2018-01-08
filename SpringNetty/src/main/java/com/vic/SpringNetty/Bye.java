package com.vic.SpringNetty;

public class Bye {
	private String name;
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void sayBye() {
		System.out.println("Bye "+name);
	}

}
