package com.vic.aopLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vic/aopLearn/beans.xml");
	    //旧
		Test1Service t=(Test1Service) ac.getBean("test1Service");
	    t.sayHello();
	    //代理
	    TestServiceInterface t2=(TestServiceInterface) ac.getBean("proxyFactoryBean");
	    t2.sayHello();
        TestServer2 t3=(TestServer2) ac.getBean("proxyFactoryBean2");
        t3.meet();
	}

}
