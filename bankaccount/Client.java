package com.bankaccount;

public class Client {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Raju",3425);
		System.out.println(ba);
//		Deposit
		Transact.deposit(ba, 1000);
		System.out.println(ba);
//		Withdraw
		Transact.withdraw(ba, 900);
		System.out.println(ba);
	}
}
