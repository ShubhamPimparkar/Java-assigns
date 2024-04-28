package com.bankaccount;

import java.util.Scanner;

public class BankAccount {
	static int accNum = 0;
	String accname;
	float bal;
	
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	Scanner sc = new Scanner(System.in);
	BankAccount(){
		accNum=accNum+3093;
		accname="NA";
		bal=0;
	}
	
	BankAccount(String accname,float bal){
		accNum=accNum+3093;
		this.accname=accname;
		this.bal=bal;
	}
	@Override
	public String toString() {
		String str = "Acc no- "+accNum+" Acc Name- "+accname+" Bal is- "+bal;
		return str;
	}

}
