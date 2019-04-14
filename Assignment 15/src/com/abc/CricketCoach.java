	package com.abc;

public class CricketCoach implements Coach{
	
	private Fortune fortune;
	
	public CricketCoach(Fortune fortune) {
		this.fortune =fortune;
	}
	@Override
	public String getDailyWorkOut() {
		
		return "Cricket Coach: Practice Daily";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
