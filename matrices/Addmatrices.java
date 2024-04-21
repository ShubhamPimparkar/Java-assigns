package com.matrices;

public class Addmatrices {
	public int[][] addmat(int arr1[][], int arr2[][]) {
		
		int[][] arr3 = new int[arr1.length][arr1.length];
		// Addition of 2 Matrices - 
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1.length; col++) {
				arr3[row][col]=arr1[row][col] + arr2[row][col];
			}
		}

		return arr3;
	}
}
