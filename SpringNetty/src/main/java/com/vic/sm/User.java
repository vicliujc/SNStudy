package com.vic.sm;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date birthdy;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public User() {
		super();
	}
	public User(int id, String name, Date birthdy, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthdy = birthdy;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdy() {
		return birthdy;
	}
	public void setBirthdy(Date birthdy) {
		this.birthdy = birthdy;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
