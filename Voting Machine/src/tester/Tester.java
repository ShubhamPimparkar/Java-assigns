package tester;

import java.util.Scanner;

import daoimplclass.CandidateDaoClass;
import daoimplclass.UserDaoClass;
import pojoclasses.User;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			UserDaoClass userDAO = new UserDaoClass();
			CandidateDaoClass candiDAO = new CandidateDaoClass();
			boolean exit = false;
			while(!exit) {
				System.out.println("1.Sign In \n2.Vote \n3.Candidate Change \n4.Candidate Party Change - ");
			

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
					
				case 3:
					System.out.println("Enter Id - Name - ");
					candiDAO.changeCandi(sc.nextInt(), sc.next());
					break;
				case 4:
					System.out.println("Enter Id - Party Name - ");
					candiDAO.changeParty(sc.nextInt(), sc.next());
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
