package com.vic.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App1 {
	
	public static void main(String[] args) {
		//bean 工厂
//		BeanFactory fac=new XmlBeanFactory(
//				new ClassPathResource("com/vic/bean/beans.xml"));
//		fac.getBean("student");
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/bean/beans.xml");
		Student s=(Student) ac.getBean("student");
		Student s2=(Student) ac.getBean("student");
		ApplicationContext ac2=new ClassPathXmlApplicationContext("com/vic/bean/beans.xml");
		Student s21=(Student) ac2.getBean("student");
		Student s22=(Student) ac2.getBean("student");
	}
}
