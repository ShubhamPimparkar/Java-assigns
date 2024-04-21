package com.bankaccount;

public class Transact {
	
	public static void withdraw(BankAccount ba1,float amt) {
		float newbal = ba1.getBal() - amt;
		ba1.setBal(newbal);
		System.out.println("Withdrawn amt "+amt);
	}
	
	public static void deposit(BankAccount ba1,float amt) {
		float newbal = ba1.getBal() + amt;
		ba1.setBal(newbal);
		System.out.println("Deposited amt "+amt);
	}
	
}
