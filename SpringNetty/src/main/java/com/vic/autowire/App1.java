package com.vic.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/autowire/beans.xml");
		Master m=(Master) ac.getBean("master");
		System.out.println(m.getDog().getName());

	}

}
