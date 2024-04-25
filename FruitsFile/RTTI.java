package com.day1;

import java.util.Scanner;

public class RTTI {

	public static void main(String[] args) {
		
		System.out.println("--------------Starting-------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Fruits you want to Add - ");
		int size = sc.nextInt();
		Fruit[] fru = new Fruit[size];
		boolean exit=false;
		while(!exit) {
		
		System.out.println("1.Add Fruits \n2.Display Fruits\n3.Fruit Funcs\n0.Exit");
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			Util.addElems(fru);
		
			break;
		case 2:
		
			Util.dispElems(fru);
			break;
		
		case 0:
			System.out.println("-----------Exiting-----------");
			exit=true;

		}
	
		
		
	}
}	

}
