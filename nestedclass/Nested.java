package com.nestedclass;

public class Nested {
	static private int num = 8;
	static class Inner{
		static void display() {
			System.out.println("Innner class num = "+num);
		}
	}
	void innerCall() {
		Inner in = new Inner();
		in.display();
	}
}
