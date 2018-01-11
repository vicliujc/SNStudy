package com.vic.aopLearn;

public class Test2Service implements TestServer2 {
	private String name;

	public void meet() {
		// TODO Auto-generated method stub
        System.out.print("meet "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
