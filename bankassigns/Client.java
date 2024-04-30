package com.bankassigns;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Limit for Bank Accounts - ");
			int size = sc.nextInt();
			BankAcc[] ba = new BankAcc[size];
			BankAcc[] ba2 = new BankAcc[1];
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add Account\n2.Display Account\n3.Withdraw\n4.Deposit\n5.Fund Transfer\n0.Exit");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					Validation.addAccnt(ba);
					break;
				case 2:
					Validation.dispAccnt(ba);
					break;
				case 3:
					System.out.println("Which account do u want to Withdraw - ");
					int wch =sc.nextInt();
					if(wch<ba.length) {
						System.out.println("Enter Amount to Withdraw - ");
						double amt = sc.nextDouble();
						ba[wch].withdraw(amt);
					}
					else {
						System.out.println("Account not Found !");
					}
					break;
				case 4:
					System.out.println("Enter Amount to Deposit - ");
					double depo = sc.nextDouble();
					ba[0].deposit(depo);
					break;
				case 5:
//					System.out.println("Add new Account to Transfer - ");
//					Validation.addAccnt(ba2);
					
					System.out.println("Which account do u want to Transfer From - ");
					int wch2 =sc.nextInt();
					System.out.println("Which account do u want to Transfer  - ");
					int wch3 =sc.nextInt();
				
					System.out.println("Enter Amount to Transfer - ");
					double newamt = sc.nextDouble();
					ba[wch3].TransferFund(ba[wch2], newamt);
						
					Validation.dispAccnt(ba);
					
					
//					System.out.println("Enter Amount to Transfer - ");
//					double newamt = sc.nextDouble();
//					ba[0].TransferFund(ba2, newamt);
//					Validation.dispAccnt(ba2);
					break;
				default:
					exit = true;
					break;
				}		
			}		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("--------------Exiting---------------");
		}
	}

}
