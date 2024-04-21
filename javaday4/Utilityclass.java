package com.javaday4;

import java.util.Scanner;

public class Utilityclass {
	public static void accptdata(Classroom[] cr) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<cr.length;i++) {
			
			System.out.println("Enter Roomid - ");
			int rid = sc.nextInt();
			System.out.println("Enter RoomName - ");
			String rnm = sc.next();
			System.out.println("Enter teachid - ");
			int tid = sc.nextInt();
			System.out.println("Enter teachname - ");
			String tnm = sc.next();
			System.out.println("1) Prof \n2) Asst Prof");
			int ch = sc.nextInt();
			
			Desg code = null;
			
			switch(ch) {
				case 1:
						code = Desg.Prof;
						break;
						
				case 2:
						code = Desg.AsstProf;
						break;
				default:
						return;
				
			}
			cr[i] = new Classroom(rid,rnm,new Teacher(tid,tnm,code));
		}
	
		}
		
		public static void showdata(Classroom[] cr) {
			for(int i=0;i<cr.length;i++) {
				
				System.out.println(cr[i]);
				
			}	
	}
}
