package com.hacker.rank;

import java.util.Scanner;

public class SumArrays {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 String[] numberStrs = line.split("\\,");
		 int[] numbers = new int[numberStrs.length];
		 for(int i = 0;i < numberStrs.length;i++)
		 {			  
			 numbers[i] = Integer.parseInt(numberStrs[i]);
		 }
		 
		 System.out.println(simpleArraySum(numbers));


	}
	
	static int simpleArraySum(int[]  ar) {
	    int i;
	    int sum = 0;
	    for(i=0;i < ar.length;i++)
	    {   
	         sum = sum + ar[i];
	    }
	    return sum;
	}

}
