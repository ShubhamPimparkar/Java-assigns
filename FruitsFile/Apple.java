package com.day1;

public class Apple extends Fruit  {

	Apple(String name, String color, double weight) {
		super(name, color, weight);
	
	}
	@Override
	public void taste() {
		System.out.println("Sweet and Sour");
		
	}
	public void jam() {
		System.out.println("Apple Jam");
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
}
