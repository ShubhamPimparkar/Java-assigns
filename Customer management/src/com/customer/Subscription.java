package com.customer;

public enum Subscription {
	SILVER(1000),GOLD(2000),DAIMOND(3000),PLATINUM(4000);
	
	private double amt;
	
	private Subscription(double amt) {
		this.amt=amt;
	}
	public double getPrice(Subscription s) {
		return s.amt;
	}
}
