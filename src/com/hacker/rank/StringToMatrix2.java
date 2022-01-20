package com.hacker.rank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringToMatrix2 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 String s = scanner.nextLine();
		 
		 int matriz [][] =  stringToInMatrix(s);
	}
	
	
	 
    private static int[][] stringToInMatrix(String s) {
    	//String s="{{1010},{1010},{1010},{0110}}";
    			s = s.replace("\\s+", "");

    			// Split on this delimiter
    			String[] rows = s.split("\\},\\{");
    			
    			//System.out.println("array: " + Arrays.deepToString(rows) + " filas " + rows.length);
    			for (int i = 0; i < rows.length; i++) {
    				System.out.println("elementos " + rows[i]);
    			    // Remove any beginning and ending braces and any white spaces
    			    rows[i] = rows[i].replace("{{", "").replace("}}", "");
    			}

    			// Get the number of columns in a row.
    			// it is only needed one line
    			int numberOfColumns = rows[0].split("").length;

    			// Setup your matrix
    			int[][] matrix = new int[rows.length][numberOfColumns];

    			// Populate your matrix
    			for (int i = 0; i < rows.length; i++) {
    				  				
    				int[] ints = Arrays.stream(rows[i].split(""))
    				        .mapToInt(Integer::parseInt).toArray();   				
    			    matrix[i] = ints;
    			}
    		
    	 		return matrix;
    			
		
	}



	public static void showArrya(String[][] a) {

        /*int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };*/
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
	 
}
