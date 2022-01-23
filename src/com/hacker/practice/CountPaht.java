package com.hacker.practice;

public class CountPaht {

	public static void main(String[] args) {
		
		boolean[][] M = {{true,true,true},{true,true,true},{true,true,true}};
		
		System.out.println(countPath(M,0,0));

	}
	
	static int  countPath(boolean[][] grid,int row, int col) {
		
		if(isAtTheEnd(grid,row,col)) {
			return 1;
		}
		
		/// row + 1, hacia abajo, co1+ 1 hacia la derecha
		return countPath(grid,row+1,col) + countPath(grid, row, col+1);
		
	}

	static private boolean isAtTheEnd(boolean[][] grid, int row, int col) {
		
		int filas = grid.length;
		int columna = grid[0].length;
		
		System.out.println(" row: " + row + " col " + col);
		System.out.println(" filas: " + filas + " columna " + columna);
		
		if(row == filas) {
			return true;
		}
		
		if(columna == col) {
			return true;
		}
		
		 
		return false;
	
	}

}
