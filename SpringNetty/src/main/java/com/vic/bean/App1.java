package com.vic.bean;

import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		CollectionBean de=(CollectionBean) ac.getBean("department");
		System.out.println(de.getName());
		for(ListBean e:de.getEmpList()) {
			System.out.println(e.name+" "+e.id);
		}
		//map 1.迭代器
		Iterator it=de.getEmpMap().keySet().iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key+":"+de.getEmpMap().get(key).getName());
		}
		//2 entry
		for(Entry<String ,ListBean> entry1:de.getEmpMap().entrySet()) {
			System.out.println(entry1.getKey()+":"+entry1.getValue());
		}
	}
}
