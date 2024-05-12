package com.app.tester;

import java.util.Scanner;

import com.account.AccountImpl;
import static com.app.utils.DBUtils.*;

public class TestLayeredJDBCApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		
			AccountImpl accntDao = new AccountImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Transfer\n0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // login
						System.out.println("Started....");
						accntDao.transferFunds(sc.nextInt(),sc.nextInt(),sc.nextDouble());
					case 0:
						exit = true;
						// destroy (shutdown/terminate app)
						closeConnection();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
