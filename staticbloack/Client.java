package com.staticbloack;

public class Client {
	
	Client(){
		System.out.println("Main Const");
	}
	
	static{
		
		System.out.println("Static Block");
		
	}
	
	public static void Func() {
		
		System.out.println("Above Main");
	
	}
	
	public static void main(String[] args) {
		Client ct = new Client();
		System.out.println("Inside Main");
		Client.Func();
		Client.main(10);
	}
	
	public static void main(int a) {
		System.out.println("Overloaded main "+a);
	}
	

	
	
	
}
