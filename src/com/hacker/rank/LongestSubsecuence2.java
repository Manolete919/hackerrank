package com.hacker.rank;

public class LongestSubsecuence2 {

	public static void main(String[] args) {
		//int[] arr = {5,8,3,9,1,5,7};
		int[] arr = {5,8};
		//int[] arr = {1,2,3,4};
 		System.out.println("array "+getSub(arr,arr.length));

	}
	
	public static boolean getSub(int[] arr, int size ) {
		int cont = 1;
		System.out.println("xxx");
		/*if(size ==  0) {
			return 0;
		}*/
		
		if(size ==  1) {
			System.out.println("sali");
			//lastone = true;
			return true;
		}
		
		
		/*if(size == arr.length) {
			return  1;
		}*/
				
		if( getSub(arr,size-1) && getSub(arr,size)) {
			cont ++;
		}
			 	
		System.out.println("contador " + cont ++);
		return true;
	}
	
	public int getSub() {
		
		if(comparar(1,0) && comparar(1,0)) {
			
		}
		
		 return 0;
	}
	
	public static boolean comparar(int a, int b) {
		
		//continua solo si es verdadero

		
		return a < b;
				
	}

}
