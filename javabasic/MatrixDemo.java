package com.javabasic;

public class MatrixDemo {

	static void arraymethod() {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=0;j<a[i].length;j++) {
		 * System.out.print(a[i][j]+" "); } System.out.println(); }
		 */
		for (int[] x : a) {
			for (int b : x) {
				System.out.print(b + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		arraymethod();
	}

}
