package com.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumDiagSquareMatrix {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 String s = scanner.nextLine();
		 
		 int matriz [][] =  stringToInMatrix(s);
		 // {{1010},{1010},{1010},{0110}}
		// {{1010},{1010}}
		 System.out.println("total de filas: " + matriz.length);
		 System.out.println("total de columnas de la fila 0: " + matriz[0].length);
		 

		 
		// T[][] array_name = new T[row][col];
		// array_name.length // row
		// array_name[0].length // col
		
		 
		int row = matriz.length;
		int col = matriz[0].length;
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				if (i == j) // this condition checks for diagonal
				{
					sum = sum + matriz[i][j];
				}
				
				if ((i + j)==(col-1)) // this condition checks for diagonal
				{
					System.out.println("ELEMENTO: " + matriz[i][j]);
					sum2 = sum2 + matriz[i][j];
				}
			}
		}
		
		System.out.println("LEFT TO RIGHT: " + sum);
		System.out.println("RIGH TO LEFT: " + sum2);
		
		int dif=sum-sum2;
        dif=Math.abs(dif);
        System.out.println(dif);

	}
	
	public static Object[] getColumn(Object[][] array, int index){
	    Object[] column = new Object[array[0].length]; // Here I assume a rectangular 2D array! 
	    for(int i=0; i<column.length; i++){
	       column[i] = array[i][index];
	    }
	    return column;
	}
	
	int[] getColumn(int[][] matrix, int column, int defaultVal) {
	    return IntStream.range(0, matrix.length)
	        .map(i -> matrix[i].length < column ? defaultVal : matrix[i][column])
	        .toArray();
	}

    private static int[][] stringToInMatrix(String s) {
    	//String s="{{1010},{1010},{1010},{0110}}";
    	
    	//{{5685},{5869},{8569},{5865}}
    	
    	//{{568588},{586956},{856988},{586555},{586555},{586555}}
    	//{{568},{586},{988}}
    	
    			s = s.replace("\\s+", "");

    			// Split on this delimiter
    			String[] rows = s.split("\\},\\{");
    			
    			//System.out.println("array: " + Arrays.deepToString(rows) + " filas " + rows.length);
    			for (int i = 0; i < rows.length; i++) {
    				
    			    // Remove any beginning and ending braces and any white spaces
    			    rows[i] = rows[i].replace("{{", "").replace("}}", "");
    			    System.out.println("fila:" + i + " " + rows[i]);
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
}
