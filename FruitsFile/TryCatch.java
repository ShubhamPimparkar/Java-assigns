package com.day1;

public class TryCatch {
	public static void main(String[] args) {
	try {
		System.out.println("Hello Main");
		int a= 10,b=0;
		int res = a/b;
		System.out.println(res);
	}
	catch( ArithmeticException a) {
		System.out.println("Arthi Exe");
		a.printStackTrace();
	}
	catch(Exception e){
		System.out.println("Exe");
		e.printStackTrace();
	}
	finally {
		System.out.println("In Finally");
	}
	System.out.println("Main Ended");
}
}
