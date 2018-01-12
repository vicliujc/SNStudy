package com.vic.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/main/beans.xml");
			NettyStart nettyStart=(NettyStart) ac.getBean("nettyStart");
			nettyStart.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
