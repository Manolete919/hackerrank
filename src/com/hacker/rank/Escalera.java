package com.hacker.rank;

public class Escalera {
	
	static int max = 0;

	public static void main(String[] args) {
		 int arr[] = {10,2,-10,5,20};
		 resolve(arr,0,0,2);
		 System.out.println("max: "+ max);

	}
	
	public static void resolve(int[] array, int sum, int start, int step) {
		
		if(step > array.length) {
			return;
		}
		
		if(step == array.length) {
			return;
		}
		
		max = Math.max(max, sum);
			
		resolve(array,sum + array[step],start + 1,1);
		resolve(array,sum + array[step],start + step,step);
		
	}

}
