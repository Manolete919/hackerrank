package com.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;

public class StringToMatrix {
	
	public static void main(String[] args) {
		 ///Scanner sc = new Scanner(System.in).useDelimiter("[,|]");
		 
		String s="[[4, 2, 2, 4], [3, 4, 5, 6], [6, 7, 8, 9], [3, 2, 1, 4]]";

		// Split on this delimiter
		String[] rows = s.split("], \\[");
		
		//System.out.println("array: " + Arrays.deepToString(rows) + " filas " + rows.length);
		for (int i = 0; i < rows.length; i++) {
			System.out.println("elementos " + rows[i]);
		    // Remove any beginning and ending braces and any white spaces
		    rows[i] = rows[i].replace("[[", "").replace("]]", "").replaceAll(" ", "");
		}

		// Get the number of columns in a row
		int numberOfColumns = rows[0].split(",").length;

		// Setup your matrix
		String[][] matrix = new String[rows.length][numberOfColumns];

		// Populate your matrix
		for (int i = 0; i < rows.length; i++) {
		    matrix[i] = rows[i].split(",");
		}
		// Display your matrix
		//System.out.println(Arrays.deepToString(matrix));
	}

}
