package com.interfaces;

public interface InterfaceClass {
	void func();
	
	static void print() {
		System.out.println("Print");
	}
	
	default void show() {
		System.out.println("Interface Show");
	}
}
