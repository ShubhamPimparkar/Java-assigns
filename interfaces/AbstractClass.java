package com.interfaces;

public abstract class AbstractClass implements InterfaceClass {
	
	AbstractClass(){
		System.out.println("Constructor in Abstract class");
	}
	
	abstract void showabs();
	
	@Override
	public void func() {
		System.out.println("Abs func in Abstract");
	}
}
