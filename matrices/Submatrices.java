package com.matrices;

public class Submatrices {

		public int[][] submat(int arr1[][], int arr2[][]) {
		
		int[][] arr4 = new int[arr1.length][arr1.length];
		// Sub of 2 Matrices - 
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1.length; col++) {
				arr4[row][col]=arr1[row][col] - arr2[row][col];
			}
		}
		return arr4;
	}
}
