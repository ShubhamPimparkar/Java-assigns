package com.bankassigns;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
	private static int MINBAL;
	static {
		MINBAL=0;
	}
	public static void validWith(double amt) throws MinBalException {
		if(amt>MINBAL) {
			System.out.println("Valid bal....");
		}else
			throw new MinBalException("insufficient balance");
	}
	
	public static void addAccnt(BankAcc[] ba) {
		for (int i = 0; i < ba.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Account no - ");
			int accid = sc.nextInt();
			System.out.println("First name - ");
			String fnm = sc.next();
			System.out.println("Last name - ");
			String lnm = sc.next();
			System.out.println("Account type - ");
			String str = sc.next();
			String acctp = str.toUpperCase();
			AccTyp acctype = AccTyp.valueOf(acctp);
			System.out.println("Date of Birth - ");
			LocalDate dob = LocalDate.parse(sc.next());
			System.out.println("Date of Acc Creation - ");
			LocalDate accdate = LocalDate.parse(sc.next());
			System.out.println("Current Bal - ");
			double cbal = sc.nextDouble();
			
			ba[i]=new BankAcc(accid, fnm, lnm, acctype, dob, accdate, cbal);
			
		}
		
	}
	public static void dispAccnt(BankAcc[] ba) {
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i]);
		}
	}
	
	
}
