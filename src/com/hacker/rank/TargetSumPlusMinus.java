package com.hacker.rank;

public class TargetSumPlusMinus {
	
	static int  sum = 0;
	static int cont = 0;

	public static void main(String[] args) {
		
		int [] arrays = {1,1,1,1,1};
		combine(arrays,0,0,3);
		System.out.println("contador: " + cont);
		
		


	}
	
	public static void combine(int[] arrays, int initialValue, int startIndex, int target) {
		//System.out.println("index: " + startIndex + " arry " +arrays.length);
		System.out.println("index: " + startIndex + " - initialValue: " + initialValue + " arry " +arrays.length);
		
		/*if(startIndex == arrays.length && initialValue == target ) {			
			cont++;
		}
		
		
		if(startIndex == arrays.length) {			
			return;
		}
 
		
		if(initialValue >  target) {
			return;
		}*/
		
		if (startIndex == arrays.length) {
			//System.out.println("pos " + pos + " target " + S + " SUM " + sum);
			if (initialValue == target)
			{
				//System.out.println("aumenta - pos " + pos);
				cont++;	
			}
				
			return;
		}
		

		//System.out.println(initialValue + " + " + arrays[startIndex]);
		 		 
		combine(arrays,initialValue + arrays[startIndex] ,startIndex+1,target);
		
		 //System.out.println(initialValue + " - " + arrays[startIndex]);
		
		combine(arrays,initialValue - arrays[startIndex] ,startIndex+1,target);	
		


		
	}

}
