package com.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumOk {
	
	public static void targetSumPair(int[] arr, int target) {
		
		Arrays.sort(arr);
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		while (leftIndex < rightIndex) {
			

			System.out.println("------Left: " + leftIndex + " Right: " + rightIndex );

			if( (arr[leftIndex] + arr[rightIndex]) > target ) {
				rightIndex --;
				System.out.println("-- > target - Left: " + leftIndex + " Right: " + rightIndex );

				
			}else if( (arr[leftIndex] + arr[rightIndex]) < target ) {

				leftIndex ++;	
				System.out.println("--- < target - Left: " + leftIndex + " Right: " + rightIndex );

			}else {

				System.out.println(arr[leftIndex] + ", " +  arr[rightIndex]);
				leftIndex ++;	
				rightIndex --;
				System.out.println("equals - Left: " + leftIndex + " Right: " + rightIndex );

			}
			
		}
		
	}
	
	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		int target = scn.nextInt();
		targetSumPair(arr,target);*/
		
		// int arr[] = { 3, 4, 5, 8, 8, 9};
		
		int arr[] = { 9, 3, 8, 4, 5, 8, 12,1 };
		int target = 12;
		targetSumPair(arr,target );
		
	}

}
