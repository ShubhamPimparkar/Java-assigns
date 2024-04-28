package com.day1;

public class Mango extends Fruit {

	Mango(String name, String color, double weight) {
		super(name, color, weight);
		
	}
	@Override
	public void taste() {
		System.out.println("Sweet");
		
	}
	public void juice() {
		System.out.println("Mango juice");
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
}
