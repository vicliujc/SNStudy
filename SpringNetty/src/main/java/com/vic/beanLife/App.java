package com.vic.beanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/beanLife/beans.xml");
		PersonService pc=(PersonService) ac.getBean("personService");
		pc.sayHi();
		
	}

}
