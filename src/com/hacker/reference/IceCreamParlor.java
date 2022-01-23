package com.hacker.reference;
// https://www.youtube.com/watch?v=Ifwf3DBN1sc&list=PLI1t_8YX-ApvMthLj56t1Rf-Buio5Y8KL&index=2
import java.util.Arrays;

public class IceCreamParlor {
	
	public static int[] findChoices(int[] menu, int money) {
		int[] sortedMenu = menu.clone();
		Arrays.sort(sortedMenu);
		for( int i = 0; i < sortedMenu.length; i++ ) {
			
			int complement = money - sortedMenu[i];
			int location = Arrays.binarySearch(sortedMenu, i +1, sortedMenu.length, complement);
			if(location >= 0 && location < sortedMenu.length && sortedMenu[location] == complement) {
				int[]  indices = getIndicesFromValues(menu, sortedMenu[i],complement);
				return indices;
			}
			
		}
		return new int[]{};
	}

	private static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
		
		int index1 = indexOf(menu,value1,-1);
		int index2 = indexOf(menu,value2,index1);
		int [] indices = {Math.min(index1, index2),Math.max(index1, index2)};
		
		return indices;
	}

	private static int indexOf(int[] menu, int value, int excludeThis) {
		for(int i=0; i < menu.length; i++) {
			if(menu[i]==value && i != excludeThis) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		 int[] menu = {1,3,5,6,7,9,11};
		 int[] choices =  findChoices(menu,25);
		 for(int i =  0; i < choices.length; i ++ ) {
			 System.out.println("I: " + menu[choices[i]]);
		 }
		 
	}

}
