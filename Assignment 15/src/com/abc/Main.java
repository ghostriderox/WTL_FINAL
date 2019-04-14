package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		//Configure
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
		Coach coach = context.getBean("myCoach", CricketCoach.class);
		Coach coach_b = context.getBean("myCoach_b",BaseballCoach.class);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach_b.getDailyWorkOut());
		System.out.println(coach_b.getDailyFortune());
	
	}

}
