package com.hacker.rank;
//Java program to find longest increasing
//path in a matrix.
import java.util.*;

class LongestPathMatrix {
	//https://www.geeksforgeeks.org/longest-increasing-path-matrix/

	// Return the length of LIP in 2D matrix
	static int LIP(int dp[][], int mat[][], int N,
				int M, int filas, int columnas)
	{
		// If value not calculated yet. (values are initializad with -1 value, the first time
		if (dp[filas][columnas] < 0) {
			int result = 0;

			// If reach bottom left cell, return 1. (it's 1 becasuse it can't go any further, and every values is 1 by default
			if (filas == N - 1 && columnas == M - 1)
				return dp[filas][columnas] = 1;

			// If reach the corner of the matrix.
			if (filas == N - 1 || columnas == M - 1) {
				System.out.println("FILA: " + filas + " COLUM "+ columnas);
				result = 1;
			}
				

			// If value greater than below cell. !
			if (filas + 1 < N && mat[filas][columnas] < mat[filas + 1][columnas])
				result = 1 + LIP(dp, mat, N, M, filas + 1, columnas);

			// If value greater than left cell.  ->
			if (columnas + 1 < M && mat[filas][columnas] < mat[filas][columnas + 1])
				result = Math.max(result, 1 + LIP(dp, mat, N, M, filas, columnas + 1));

			dp[filas][columnas] = result; 
		}

		return dp[filas][columnas];
	}

	// Wrapper function
	static int wrapper(int mat[][], int n, int m)
	{
		int dp[][] = new int[10][10];
		for (int i = 0; i < 10; i++)
			Arrays.fill(dp[i], -1);
		 

		return LIP(dp, mat, n, m, 0, 0);
	}

	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int mat[][] = {
			{ 1, 2, 3, 4 },
			{ 2, 2, 3, 4 },
			{ 3, 2, 3, 4 },
			{ 4, 5, 6, 7 },
		};
		int n = 4, m = 4;
		System.out.println(wrapper(mat, n, m));
	}
}

//This code is contributed by Arnav Kr. Mandal.

