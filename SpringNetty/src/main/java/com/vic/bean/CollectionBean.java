package com.vic.bean;

import java.util.*;


public class CollectionBean {
	private String name;
	private String[] empName;
	public List<ListBean> empList;
	public Map<String,ListBean> empMap;
	
	public Map<String, ListBean> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, ListBean> empMap) {
		this.empMap = empMap;
	}
	public List<ListBean> getEmpList() {
		return empList;
	}
	public void setEmpList(List<ListBean> empList) {
		this.empList = empList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpName() {
		return empName;
	}
	public void setEmpName(String[] empName) {
		this.empName = empName;
	}
	

}
