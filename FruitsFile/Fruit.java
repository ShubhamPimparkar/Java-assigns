package com.day1;

public abstract  class Fruit {
	
	private String name;
	private String color;
	private double weight;
	
	
	public abstract void taste();
	Fruit(String name,String color,double weight){
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "Name = "+name+" ,Color = "+color+" ,Weight = "+weight;
		
	}
}


