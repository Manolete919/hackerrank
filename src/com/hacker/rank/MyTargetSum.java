package com.hacker.rank;

import java.util.Arrays;

public class MyTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,8,4,2,3,10,8,3};
		Arrays.sort(arr);
		System.out.println(target(arr,13,0,0));
		//{2,3,3,8,4,5,8,10}

	}
	
	public static int target(int[] arr, int target, int indice, int cont) {
		
		System.out.println("INDICIE " + indice + " lenth " + arr.length);
		 
		if(indice == arr.length) {
			return cont;
		}
		
		int inicio = arr[indice];
		
		//Por que el ultimo esta repetido
		if(indice > 0)
			//si el ultimo indice es igual al anterior, irse al siguiente indice
			if(inicio == arr[indice-1]) {			 
				indice++;
				return target(arr,target,indice,cont);
			}
		
		for(int i = indice+1; i < arr.length; i ++ ) {
						
			if(inicio + arr[i] == target) {
				System.out.println("a="+inicio + ",b="+ arr[i]);				
				cont ++;
				break;			
			}
			
			
		}
		indice++;
		
		return target(arr,target,indice,cont);				

	}

}
