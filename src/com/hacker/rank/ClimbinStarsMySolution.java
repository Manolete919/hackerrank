package com.hacker.rank;

public class ClimbinStarsMySolution {
	
	static int  cont = 0;

	public static void main(String[] args) {
		
		
		System.out.println("contador: " + numOfWays(1));
		System.out.println("contador: " + numOfWays(2));
		System.out.println("contador: " + numOfWays(3));
		System.out.println("contador: " + numOfWays(4));
		System.out.println("contador: " + numOfWays(5));
	    System.out.println("contador: " + numOfWays(6));

	}
	
	public static int numOfWays(int n) {
		cont = 0;
		solve(0,n);
		return cont;
 
	}
	
	public static void solve(int step,int n) {
		
		if(step == n ) {
			cont ++;
			return;
		}
		if(step > n) {
			return;
		}
		
		solve(step + 1, n );
		solve(step + 2, n );
		
	}
	 

}
