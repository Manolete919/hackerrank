package com.hacker.rank;

public class Fibonacci {

	public static void main(String[] args) {
		//System.out.println("POSICION: " + getFn(7));
		System.out.println(checkNumberFn(3,3));
		
	}
	
	public static int getFn(int n) {
		
		int result = 0;
		
		if(n == 0 ) {
			
			return result;
		}
		
		if(n == 1 ) {
			
			return 1;
		}

		//n > 1
		
		result = getFn(n-1) + getFn(n-2);
		
		//System.out.println("resultado: " + result);
 
		return result;		
	}
	
	public static String checkNumberFn(int n,int c) {
		
		if(n <= 1 ) {
			return "yes";
		}
						
		int fib = getFn(c);
		if(fib == n) {
			return "yes";
		}else if(fib < n ) {
			return checkNumberFn(n,c+1);
		}else {
			return "no";
		}


			
	}
	
	

}
