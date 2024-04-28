package com.vehicleexcp;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Size to add Vehicles - ");
			int size = sc.nextInt();
			Vehicle[] vh = new Vehicle[size];
			boolean exit = false;
			while(!exit) {
				
			
			System.out.println("------------Choose Options-------------");
			System.out.println("1.Add Vehicles\n2.Drive\n3.Display Vehicles\n0.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				
				Util.addVeh(vh);
				break;
			case 2:
				Util.driveVeh(vh);
				break;
			case 3:
				Util.dispVeh(vh);
				break;

			default:
				exit=true;
				System.out.println("---------Exiting----------");
			}
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("--------------Exiting----------------");
		}

	}

}
