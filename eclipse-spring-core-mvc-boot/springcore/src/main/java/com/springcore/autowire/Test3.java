package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Emp emp1= (Emp) context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}
