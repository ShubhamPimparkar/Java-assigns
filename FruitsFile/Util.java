package com.day1;

import java.util.Scanner;

public class Util {
	public static void addElems(Fruit[] fru) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fru.length; i++) {
			boolean exit=false;
			while(!exit) {
			System.out.println("---------Fruits Section-------");
			System.out.println("1.Add Mango \n2.Add Orange\n3.Add Apple\n0.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				sc.nextLine();
				System.out.println("Enter Mango Name - ");
				String nm=sc.nextLine();
				System.out.println("Enter Mango Color - ");
				String cm=sc.nextLine();
				System.out.println("Enter Mango Weight - ");
				double mw=sc.nextDouble();
				fru[i]=new Mango(nm,cm,mw);
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Enter Orange Name - ");
				
				String onm=sc.nextLine();
				System.out.println("Enter Orange Color - ");
				String ocm=sc.nextLine();
				System.out.println("Enter Orange Weight - ");
				double omw=sc.nextDouble();
				fru[i]=new Orange(onm,ocm,omw);
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter Apple Name - ");
				String anm=sc.nextLine();
				System.out.println("Enter Apple Color - ");
				String acm=sc.nextLine();
				System.out.println("Enter Apple Weight - ");
				double amw=sc.nextDouble();
				fru[i]=new Apple(anm,acm,amw);
				break;
				
			case 0:
				System.out.println("-----------Exiting Fruit Section-----------");
				exit=true;
				break;
			}
			}
		}
		
	}
	
	public static void dispElems(Fruit[] fru) {
		for (int i = 0; i < fru.length; i++) {
			System.out.println(fru[i]);
			if(fru[i] instanceof Mango) {
				fru[i].taste();
				Mango mg = (Mango)fru[i];
				mg.juice();
			}
			else if (fru[i] instanceof Orange) {
				fru[i].taste();
				Orange mg = (Orange)fru[i];
				mg.juice();
			}
			else {
				fru[i].taste();
				Apple mg = (Apple)fru[i];
				mg.jam();
			}
		}
		
	}

}
