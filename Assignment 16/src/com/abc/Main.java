package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create application context/configure
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//getBean
		Employee employee = context.getBean("employee", Employee.class);
		
		// call Bean
		System.out.println(employee);
		
		Employee employee2 = context.getBean("employee",Employee.class);
		
		if(employee == employee2)
		{
			System.out.println("Scope is Singleton");
		}
		else
		{
			System.out.println("Scope is Prototype");
		}
		//close
		
	}

}
