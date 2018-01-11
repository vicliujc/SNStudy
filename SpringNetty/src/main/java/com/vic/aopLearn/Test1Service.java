package com.vic.aopLearn;

public class Test1Service implements TestServiceInterface {

	private String name;
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hi "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
