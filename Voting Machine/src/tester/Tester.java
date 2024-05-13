package tester;

import java.util.Scanner;

import daoimplclass.UserDaoClass;
import pojoclasses.User;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			UserDaoClass userDAO = new UserDaoClass();
			boolean exit = false;
			while(!exit) {
				System.out.println("1.Sign In 2.Vote - ");
			

				switch (sc.nextInt()) {
				case 1:	
					System.out.println("Enter mail - pass - ");
					User user = userDAO.signIn(sc.next(),sc.next());
					System.out.println("Welcome - "+user.getFname());
					break;
				case 2:	
					System.out.println("Enter Mail - Pass - Candidate id - ");
					userDAO.vote(sc.next(),sc.next(),sc.nextInt());
					break;

				default:
					break;
				}			
				
			}
		}
			
		
		catch (Exception e) {
			e.printStackTrace(); 

	}
	}
}
