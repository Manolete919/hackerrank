package com.hacker.udemy;

public class NQueensProblem {
	
	private int[][] chessTable;
	private int numOfQueens;
	
	public  NQueensProblem(int numOfQueens) {
		this.numOfQueens = numOfQueens;
		this.chessTable = new int[numOfQueens][numOfQueens];
	}
	
	public void solve() {
		
		if(setQueens(0)) {
			printQueen();
		}else {
			System.out.println("There is no solution");
		}
		
	}
	
	private boolean setQueens(int colIndex) {
		// TODO Auto-generated method stub
		//Finalizar	
		if(colIndex == this.numOfQueens) {
			return true;
		}
		
		
		//Por cada funcion RECORRE ROWS desde 0 a N
		for(int rowIndex = 0; rowIndex < this.numOfQueens; rowIndex ++ ) {
			
			if(isPlaceValid(rowIndex,colIndex)) {
				
				this.chessTable[rowIndex][colIndex] = 1;
				
				// explore las demas columnas
				
				if(setQueens(colIndex + 1 )) {
					// rompe la iteracion, no continua el for con las siguientes filas
					return true;
				}
				
				// si el for continua
				// BACKTRACK
				// Reinicar
				this.chessTable[rowIndex][colIndex] = 0;
				// continua el FOR con la siguiente FILA, y se repite el proceso
				
			}
			
			
		}
		
		return false;
	}

	private boolean isPlaceValid(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		for(int i = 0; i < colIndex;  i++) {
			if(this.chessTable[rowIndex][i] == 1 ) {
				return false;
			}
		}
		
		for( int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--,j--)
			if(this.chessTable[i][j] == 1)
					return false;
		
		for( int i = rowIndex, j = colIndex; i < this.chessTable.length && j >= 0; i++,j--)
			if(this.chessTable[i][j] == 1)
					return false;
		
		return true;
	}

 
	
	private void printQueen() {
		
		for(int i=0; i < chessTable.length; i++ ) {
			for( int j = 0; j < chessTable.length; j ++) {
				if(chessTable[i][j]== 1 ) {
					System.out.print(" * ");
				}else {
					System.out.print(" - ");
				}
			} 
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		NQueensProblem problem = new NQueensProblem(4);
		problem.solve();


	}

}
