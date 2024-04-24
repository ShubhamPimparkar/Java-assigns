package com.interfaces;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		InterfaceClass ic = new ImplementedClass();
		AbstractClass abs = (AbstractClass)ic;
		
		abs.showabs();  // in implemented class
		ic.func();   // in abstract class
		ic.show();   // in interface
		
	}

}
