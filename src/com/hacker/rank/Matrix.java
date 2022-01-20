package com.hacker.rank;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 		
		int M [][]  = {{0,1,2,3},{7,5,4,9}};
		
		int marks[][]= {{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};


		int i, j, row, col, sum = 0;

		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("");
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				sum = sum + mat[i][j];
			}
		}
		System.out.println("SUM of the elements of the matrix = " + sum);
	}

}
