package com.customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			Customer cr[] = new Customer[2];
			List<Customer> cr = new ArrayList<Customer>();
			Customer c1 = new Customer("Shubham","shubham@gmail.com","123",LocalDate.parse("2001-02-17"),Subscription.DAIMOND,3000);
			Customer c6 = new Customer("Rahul","rahul@gmail.com","123",LocalDate.parse("2002-12-07"),Subscription.GOLD,2000);
			Customer c3 = new Customer("Praj","raj@gmail.com","123",LocalDate.parse("2001-02-17"),Subscription.SILVER,1000);
			Customer c4 = new Customer("Nikki","nikki@gmail.com","123",LocalDate.parse("2007-06-13"),Subscription.PLATINUM,4000);
			Customer c5 = new Customer("Yash","yash@gmail.com","123",LocalDate.parse("2001-02-17"),Subscription.DAIMOND,3000);
			cr.add(c1);
			cr.add(c6);
			cr.add(c3);
			cr.add(c4);
			cr.add(c5);
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1.Signup\n2.Display All\n3.Sign in\n4.Remove Subscription\n5.Sort ascending email\n6.Sort DOB and Name\n7.Exit");
					System.out.println("Enter Choice - ");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter - Name Mail Password DOB Subscription Price");
						Customer cst = Utils.signup(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), cr);
						cr.add(cst);

						System.out.println("--------------Details Recorded-------------");
						break;
					case 2:
						Utils.dispall(cr);
						break;
					case 3:
						System.out.println("Enter - Email and Password");
						String mail = sc.next();
						String pass = sc.next();
						Customer c=Utils.signin(mail,pass,cr);
						System.out.println("------------Sign in Success------------");
						System.out.println("Update Password - ");
						c.setPasswd(sc.next());
						System.out.println("------------Password set Success------------");
						
						break;
					case 4:
						System.out.println("Enter - Email and Password");
						String mail2 = sc.next();
						String pass2 = sc.next();
						Customer c2=Utils.signin(mail2,pass2,cr);
						System.out.println("------------Do You want to Remove Subscription [y/n]-------------");
						String ch2 = sc.next();
						String yes = "y";
						if(ch2.equals(yes)) {
							cr.remove(c2);
							System.out.println("------------Account Removed--------------");
						}
						else
							break;
						break;
					case 5:
						Collections.sort(cr);
						System.out.println("------------Sorted--------------");
						Utils.dispall(cr);
						break;
					case 6:
//						Collections.sort(cr,new ComparatorClass());
						
						Collections.sort(cr,new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {

								System.out.println("------------IN COMPARE-----------");
								if(o1.getDob().equals(o2.getDob())) {
									
									return o1.getName().compareTo(o2.getName());
								}
								return o1.getDob().compareTo(o2.getDob());
								
							}
							
							
						});
						
						System.out.println("------------Sorted--------------");
						Utils.dispall(cr);
						break;
					case 7:
						exit = true;
						break;

					default:
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
