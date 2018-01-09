package interfacePro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
//		UpperLetter up=(UpperLetter) ac.getBean("changeLetter");
//		System.out.println(up.change());
		ChangeLetter cL=(ChangeLetter) ac.getBean("changeLetter");
		System.out.println(cL.change());
	}

}
