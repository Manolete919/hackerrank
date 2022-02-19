package com.hacker.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestSumDynamic {

	public static void main(String[] args) {
		System.out.println(bestSum2(8,new int[] {2,3,5}));
	}
	
    private static List<Integer> bestSum(int targetSum, int[] numbers) {
        //List<Integer>[] dt = (List<Integer>[]) new ArrayList<?>[targetSum+1];
        
        List<Integer>[] dt = (ArrayList<Integer>[]) new ArrayList[targetSum+1];

        int result = Integer.MAX_VALUE;
        Arrays.fill(dt, null);
        dt[0] = new ArrayList<Integer>();
        for(int i= 0; i < dt.length; i++) {
                for(int j = 0; j < numbers.length; j ++) {
                    if(dt[i] != null) { 
                        if((i  + numbers[j]) <= targetSum) {
                        	
                        	//System.out.println("antes " + (i  + numbers[j]) + " " + dt[i  + numbers[j]]);
                        	
                        	ArrayList<Integer> newList = new ArrayList<Integer>(dt[i]);
                        	newList.add(numbers[j]);
                        	
                        	if(null == dt[i  + numbers[j]] || dt[i  + numbers[j]].size() > newList.size() ) {
                        		dt[i  + numbers[j]] = newList;
                        	}
                                                                                                        
                        }
                      
                    }                       
                }
        }
        for(int i= 0; i < dt.length; i++) {
            System.out.println("INDICE " + i + " -> "+ dt[i]);
        }
        return dt[targetSum];
    }
    
    private static List<Integer> bestSum2(int targetSum, int[] numbers) {
        //List<Integer>[] dt = (List<Integer>[]) new ArrayList<?>[targetSum+1];
        
        List<Integer>[] dt = (ArrayList<Integer>[]) new ArrayList[targetSum+1];

        Arrays.fill(dt, null);
        dt[0] = new ArrayList<Integer>();
		for (int i = 0; i < dt.length; i++) {
			for (int number : numbers) {
				if (dt[i] != null) {
					if ((i + number) <= targetSum) {
						ArrayList<Integer> combination = new ArrayList<Integer>(dt[i]);
						combination.add(number);
						if (null == dt[i + number] || dt[i + number].size() > combination.size()) {
							dt[i + number] = combination;
						}
					}

				}
			}
		}
        for(int i= 0; i < dt.length; i++) {
            System.out.println("INDICE " + i + " -> "+ dt[i]);
        }
        return dt[targetSum];
    }

}
