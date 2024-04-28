package com.lambdaexpr;

public class Client {

	public static void main(String[] args) {
		Lambda lm = (a,b)->System.out.println("Add is "+(a+b));
		lm.add(2,3);
		System.out.println(Lambda.a + Lambda.b);
		

	}

}
