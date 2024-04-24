package com.anonmyousclass;

public class Client {

	public static void main(String[] args) {
		Anon an = new Anon() {
			@Override
			void show() {
				System.out.println("Anonymous Show");
				
			}
			@Override
			void disp() {
				System.out.println("This is Anon disp");
			}
		
		};
		an.show();
		an.disp();
		

	}

}
