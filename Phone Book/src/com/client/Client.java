package com.client;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import com.contact.Contact;
import com.validation.Validate;

public class Client {

	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in);){
			
		Set<Contact> set = new HashSet<>();
		Contact c1 = new Contact("902345", "Shubham", LocalDate.parse("2001-03-04"), "Mail1");
		Contact c2 = new Contact("902334", "Rahul", LocalDate.parse("2002-03-04"), "Mail2");
		Contact c3 = new Contact("902345", "Bunty", LocalDate.parse("2003-03-04"), "Mail3");
		Contact c4 = new Contact("902367", "Yash", LocalDate.parse("2005-03-04"), "Mail5");
		Contact c5 = new Contact("902324", "Abhay", LocalDate.parse("2006-03-04"), "Mail4");
		Contact c6 = new Contact("902324", "Yash", LocalDate.parse("2007-03-04"), "Mail4");
		Contact c7 = new Contact("902324", "Yash", LocalDate.parse("2008-03-04"), "Mail4");
		Contact[] carr = { c1, c2, c3, c4, c5 ,c6,c7};
		boolean exit = false;
		while (!exit) {
			System.out.println("Input - ");
			switch (sc.nextInt()) {
			case 1:
				for (Contact c : carr) {
					set.add(c);
				}
				break;
			case 2:
				for (Contact c : set) {
					System.out.println(c);
				}
				break;
			case 3:

				System.out.println("Enter name and dob to validate - ");
				Validate.validContact(set,sc.next(),sc.next());
				
				System.out.println("---------Valid Input-----------");
							
				break;
			case 4:

				Set<Contact> tree=new TreeSet<>(set);
			
				for (Contact c : tree) {
					System.out.println(c);
				}
				System.out.println("-------------Sorted-------------");
			case 0:
				exit = true;
				sc.close();
				System.out.println("----------EXITED-----------");
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
