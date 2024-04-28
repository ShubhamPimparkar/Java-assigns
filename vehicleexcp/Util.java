package com.vehicleexcp;


import java.util.Scanner;
import static com.vehicleexcp.Colors.BLUE;
import static com.vehicleexcp.Colors.BLACK;
import static com.vehicleexcp.Colors.WHITE;
import static com.vehicleexcp.Colors.RED;
import static com.vehicleexcp.Colors.SILVER;
public class Util {
	 
	@SuppressWarnings("static-access")
	public static void addVeh(Vehicle[] vh) throws ColorException {
		Colors[] colarr = {BLUE,BLACK,WHITE,RED,SILVER};
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<vh.length;i++) {
			System.out.println("Enter Name - ");
			String vhnm = sc.next();
			System.out.println("Enter Chasis no - ");
			String chno = sc.next();
			System.out.println("Choose Color - \n1.WHITE\n2.SILVER\n3.BLACK\n4.RED\n5.BLUE\n6.Enter a color - ");
			int ch = sc.nextInt();
			Colors emch=null;
			switch (ch) {
			case 1:
				emch=Colors.WHITE;
				break;
			case 2:
				emch=Colors.SILVER;				
				break;
			case 3:
				emch=Colors.BLACK;
				break;
			case 4:
				emch=Colors.RED;
				break;
			case 5:
				emch=Colors.BLUE;
				break;
			case 6:
				System.out.println("Enter Color - ");
				String newcol = sc.next();
				try {
					for (int j = 0; j < colarr.length; j++) {
						
						if(colarr[j].valueOf(newcol) == RED ) {
							emch = Colors.RED;
						}				
						else if(colarr[j].valueOf(newcol) == BLACK ) {
							emch = Colors.BLACK;
						}				
						else if(colarr[j].valueOf(newcol) == BLUE ) {
							emch = Colors.BLUE;
						}				
						else if(colarr[j].valueOf(newcol) == WHITE ) {
							emch = Colors.WHITE;
						}				
						else if(colarr[j].valueOf(newcol) == SILVER ) {
							emch = Colors.SILVER;
						}			
						else {
							emch=Colors.valueOf(newcol);
						}
					}
				}
				catch(Exception e) {
					throw new ColorException("Invalid Color!!");
				}
//				finally {
//					System.out.println("--------------Cannot be added----------------");
//				}
			default:
				break;
			}
			System.out.println("Price of Vehicle - ");
			double prc = sc.nextDouble();
			System.out.println("Pollution Level - ");
			double poll = sc.nextDouble();
			vh[i]=new Vehicle(vhnm,chno, emch, prc, poll);
		}
	}
	public static void dispVeh(Vehicle vh[]) {
		for (int i = 0; i < vh.length; i++) {
			System.out.println(vh[i]);
		}
	}
	public static void driveVeh(Vehicle vh[]) throws PucException {
		for (int i = 0; i < vh.length; i++) {
			if(vh[i].getPollutionLevel()<80) {
				System.out.println("You can Drive - "+vh[i].getVhname());
			}
			if(vh[i].getPollutionLevel()>=80) {
				throw new PucException("High Pollution cannot Drive !!");
			}
		}
	}
	
}
