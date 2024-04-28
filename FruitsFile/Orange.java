package com.day1;

public class Orange extends Fruit  {

	Orange(String name, String color, double weight) {
		super(name, color, weight);
		
	}
	@Override
	public void taste() {
		System.out.println("Sour");
		
	}
	public void juice() {
		System.out.println("Orange juice");
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
}
