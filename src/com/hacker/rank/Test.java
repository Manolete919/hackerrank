package com.hacker.rank;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
    /*
     * Complete the 'journey' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY path
     *  2. INTEGER maxStep
     */

    public static long journey(List<Integer> path, int maxStep) {
    // Write your code here
    
        //int arr[] = path.stream().mapToInt(Integer::intValue).toArray();
       
        int arr[] = {0,2,-10,5,20};
       
        int k = maxStep -1, i = maxStep -1;  
        System.out.println(puntosMaximos(arr,arr.length,k-1+2,i+2));
           
        return puntosMaximos(arr,arr.length,k-1,i);
    
    
    }
    
    /*public static void main(String[] args) {
        int arr[] = {0,2,-10,5,20};
        
        int k = 2, i = 2;  
        System.out.println(puntosMaximos(arr,arr.length,k-1,i));
           
        //return puntosMaximos(arr,arr.length,k-1,i);
	}*/
    
    
    public static int puntosMaximos(int array[], int n, int k, int i){
        int start;
        if(k > i){
            start = 0;
        }else{
            start = i - k;
        }
        
        //start = i;
        
        int res = 0;
        
        for (int j = start; j <= start + k && j < n; j++){
            res += array[j];
        }
        
        int suma_actual = res;
        for(int j = start + k + 1; j < n && j <= i + k; j++){
            suma_actual += array[j] - array[j - k - 1];
            res = Math.max(res, suma_actual);
        }
        
        return res;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {10,2,-10,5,20};
        
       /* List<Integer> integer = new ArrayList<>();
        integer.add(0);
        integer.add(2);
        integer.add(-10);
        integer.add(5);
        integer.add(20);*/
        
        
        int k = 6, i =0 ;  
        //System.out.println(journey(integer,2));
        
        System.out.println(puntosMaximos(arr,arr.length,k-1,i));
           
        //return puntosMaximos(arr,arr.length,k-1,i);
	}

}
