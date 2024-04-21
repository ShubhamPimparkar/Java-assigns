package com.matrices;

import java.util.*;

public class Javapract1 {

	public static void main(String[] args) {
		// 2 D array Matrix Operations
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element of Array 1 - ");
		int[][] arr1 = new int[3][3];

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1.length; col++) {
				System.out.print("Element " + row + " " + col + " ");
				arr1[row][col] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter Element of Array 2 - ");
		int[][] arr2 = new int[3][3];
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2.length; col++) {
				System.out.print("Element " + row + " " + col + " ");
				arr2[row][col] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Element Matrix 1 - ");
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1.length; col++) {
				System.out.print(arr1[row][col] + "  ");
			}
			System.out.println();
		}


		System.out.println("Element Matrix 2 - ");
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2.length; col++) {
				System.out.print(arr2[row][col] + "  ");
			}
			System.out.println();
		}
		
		
//		--------------------------------------------------------------
		System.out.println();
		System.out.println("Add of Matrices - ");
		Addmatrices am = new Addmatrices();
		int[][] newarr = am.addmat(arr1,arr2);
		
		for (int row = 0; row < newarr.length; row++) {
			for (int col = 0; col < newarr.length; col++) {
				System.out.print(newarr[row][col] + "  ");
			}
			System.out.println();
		}
		
//		----------------------------------------------------------------
		System.out.println();
		System.out.println("Sub of Matrices - ");
		Submatrices sm = new Submatrices();
		int[][] newsubarr = sm.submat(arr1,arr2);
		
		for (int row = 0; row < newsubarr.length; row++) {
			for (int col = 0; col < newsubarr.length; col++) {
				System.out.print(newsubarr[row][col] + "  ");
			}
			System.out.println();
		}
//		-----------------------------------------------------------------
	}

}
