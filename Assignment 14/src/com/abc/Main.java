package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configure
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			//remove the errors by adding 2 import files	
			
		//get Bean
			Student student =context.getBean("student",Student.class);
			
		//call bean
			System.out.println(student);
		//close
	}

}
