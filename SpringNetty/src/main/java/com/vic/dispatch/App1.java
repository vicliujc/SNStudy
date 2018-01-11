package com.vic.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/dispatch/beans.xml");
		DBUtil d=(DBUtil) ac.getBean("dbutil");
		System.out.println(d.getName());

	}

}
