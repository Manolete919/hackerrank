package com.hacker.reference;
// https://www.youtube.com/watch?v=SLauY6PpjW4
public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {9,26,4,3,5,1};
		quicksort(array);
		for(int i = 0; i < array.length; i++ ) {
			System.out.println("elme: " + array[i]);
		}
	}
	
	public static void quicksort(int[] array) {
		quicksort(array,0,array.length-1);
	}

	private static void quicksort(int[] array, int left, int right) {
		//System.out.println("inicio " + left + " " + right);
		
		if(left >= right) {
			return;
		}
		
		int pivot = array[(left + right )/ 2];
		//System.out.println("pivot " + pivot);
		int index = partition(array,left,right,pivot);
		//System.out.println("index parti  " + index);
		quicksort(array,left,index-1);
		quicksort(array,index,right);
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		
		while (left <= right) {
			//look an element in the left part that's bigger than the pivot
			while(array[left] < pivot) {
				left++;
			}
			
			while(array[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				// pasa una referencia de array, y esa referencia se puede ver afuera
				swap(array,left,right);
				left++;
				right --;
			}
		}

		return left;
	}

	private static void swap(int[] array, int left, int right) {
		//int[] tmpArray = array;
		//System.out.println("cmabio " + left + " " + right);
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;	
	}

}
