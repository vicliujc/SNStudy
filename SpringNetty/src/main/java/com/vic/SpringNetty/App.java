package com.vic.SpringNetty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private String name;
	private Bye b;
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBye(Bye b) {
		this.b=b;
	}
	public Bye getBye() {
		return b;
	}
	
	public void sayHello() {
		System.out.println("hello "+name);
		b.sayBye();
	}
	
    public static void main( String[] args )
    {
//    	App a=new App();
//		a.setName("家琛");
//		a.sayHello();
   	
    	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    	App a=(App)ac.getBean("hello");
    	Bye b=(Bye)ac.getBean("bye");    	
    	a.sayHello();
    	b.sayBye();
    	
    }
}
