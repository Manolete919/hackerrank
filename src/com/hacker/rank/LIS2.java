package com.hacker.rank;

public class LIS2 {
	
	
	static int max_ref; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,6,9};
		//int[] arr = {5,1,8,9,6,1,7,1,8,10};
		System.out.print(lis(arr));
	}
	

	
	public static int secuence(int startIndex, int[] arr,int inicio,int cont) {
			
		 
		int a = 0, b= 0; 
				 				 
		if(startIndex < arr.length-1) {	
			a = arr[inicio];
			b = arr[startIndex+1];

			
			startIndex ++;
			
			if(a <= b ) {				 			
				cont ++;
				System.out.println("---"+a+","+b+",");				
				System.out.println("----- antes de entrar cont " + (cont) + " starind " + startIndex);
				cont = secuence(startIndex, arr,startIndex,cont);
				
				//System.out.println("-");

			}else {
				
				cont = 1;
				//cont = secuence(startIndex, arr,inicio,cont);
			}
			 
			 
			cont = secuence(startIndex, arr,inicio,cont);
			
			
		}
		
        if (max_ref < cont) 

            max_ref = cont; 

		
		return cont;
	}
	
    static int lis(int arr[]) 

    { 

        // The max variable holds the result 

        max_ref = 1; 

  

        // The function _lis() stores its result in max 

        secuence(0,arr,0,1); 

  

        // returns max 

        return max_ref; 

    } 

}
