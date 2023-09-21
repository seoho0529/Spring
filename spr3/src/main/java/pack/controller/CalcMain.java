package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		
		MyServiceInter inter = (MyServiceInter)context.getBean("myService"); //getBean("myService")를 통해 빈이 넘어옴
		inter.inputMoney();
		inter.showMoney();
	}

}
