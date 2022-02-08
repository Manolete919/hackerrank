package com.hacker.rank;

import java.util.Arrays;
import java.util.Collections;

public class LowestCost {


	public static void main(String[] args) {
		int[] days = {1,7};
		System.out.println("Result: " + resolve(days) );
	}
	
	
	public static int resolve(int[] days) {
		

		
		boolean[] tripDays = new boolean[31];
		
		//Indica si el dia es un dia de trip
		for (int d : days) {
			tripDays[d] = true;
		}
		
		// itera todos los dias y pregunta si es un dia de viaje
		
		int[] moneySpent = new int[31];
		
		for(int day = 1; day<31; ++day) {
			
			if(!tripDays[day]) {
				moneySpent[day] = moneySpent[day-1];
				continue;
			}
			
			// calcular los minimos hasta el dia de hoy			
			int min = moneySpent[day-1] + 2;
			//7 dolares
			min = Math.min(min, moneySpent[Math.max(0, day-7)]+7);
			
			min = Math.min(min, 25);
			
			moneySpent[day]=min;
			
		}
		
		return moneySpent[30];
		
		
		
		
		

	}
	
	
	
	public static boolean containsAll( int[] array,  int[] values, int indexAt, int endAt) {
				 
		for(int v: values) {
			if(contains(array,   v,  indexAt,  endAt)) {
				return true;
			}
		}
				
		return false;
	}
	
	
    public static boolean contains( int[] array,  int v, int indexAt, int endAt) {

        boolean result = false;

        for(int i = indexAt; i< endAt; i++){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
    
    public static int findArray(Integer[] array, Integer[] subArray)
    {
        return Collections.indexOfSubList(Arrays.asList(array), Arrays.asList(subArray));
    }

}
