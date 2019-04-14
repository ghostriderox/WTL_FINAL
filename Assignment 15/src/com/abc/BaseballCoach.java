package com.abc;

public class BaseballCoach implements Coach{
	
	private Fortune fortune;
	
	public BaseballCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Baseball Coach: Practise Daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
