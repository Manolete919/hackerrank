package com.hacker.rank;

import java.util.Arrays;

//https://www.geeksforgeeks.org/java-program-for-longest-increasing-subsequence/amp/

/* A Naive Java Program for LIS Implementation */

class LIS { 

    static int max_ref; // stores the LIS 

  

    /* To make use of recursive calls, this function must return 

   two things: 

   1) Length of LIS ending with element arr[n-1]. We use 

      max_ending_here for this purpose 

   2) Overall maximum as the LIS may end with an element 

      before arr[n-1] max_ref is used this purpose. 

   The value of LIS of full array of size n is stored in 

   *max_ref which is our final result */

    static int _lis(int arr[], int n) 

    { 

        // base case 

        if (n == 1) {
        	System.out.println(" n:" + n);
        			 return 1; 
        }

           

  

        // 'max_ending_here' is length of LIS ending with arr[n-1] 

        int res, max_ending_here = 1; 

  

        /* Recursively get all LIS ending with arr[0], arr[1] ... 

           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and 

           max ending with arr[n-1] needs to be updated, then 

           update it */
        
        //System.out.println(Arrays.deepToString(arr));

        for (int i = 1; i < n; i++) { 
            
        	//System.out.println(" n:" + n  + " indice:"+ i);

            res = _lis(arr, i); 
            
            //int cont = res + 1;

            //inicia en 2
            // si el elemento trasero es menor que el penultimo
            
            int elemento_trasero = arr[i - 1];
            int elemento_penultimo = arr[n - 1];
            System.out.println("res: " + (res + 1 )+ " i="+ i+  ", n=" + n  + " " +elemento_trasero + " < " + elemento_penultimo);

          
            //System.out.println("t: " + elemento_trasero + "< p: " + elemento_penultimo);
            if (elemento_trasero < elemento_penultimo && res + 1 > max_ending_here) {
            	
            	 max_ending_here = res + 1; 
  
            	 System.out.println(" Contador " + max_ending_here);
            }
         	 /*if(max_ending_here == 5 ) {
        		 System.out.println("soy cinco" + (res + 1));
        	 } */
            
            //System.out.println("max_ending_here: " + max_ending_here + " cont " + cont );

        } 

  

        // Compare max_ending_here with the overall max. And 

        // update the overall max if needed 

        if (max_ref < max_ending_here) 

            max_ref = max_ending_here; 

  

        // Return length of LIS ending with arr[n-1] 
        System.out.println("-----" + max_ending_here);
        return max_ending_here; 

    } 

  

    // The wrapper function for _lis() 

    static int lis(int arr[], int n) 

    { 

        // The max variable holds the result 

        max_ref = 1; 

  

        // The function _lis() stores its result in max 

        _lis(arr, n); 

  

        // returns max 

        return max_ref; 

    } 

  

    // driver program to test above functions 

    public static void main(String args[]) 

    { 

        //int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int arr[] = { 5,1,7 }; 


        int n = arr.length; 

        System.out.println("Length of lis is "

                           + lis(arr, n) + "\n"); 

    } 
} 
/*This code is contributed by Rajat Mishra*/