package com.hacker.rank;

public class LowestCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int calculate(int[] days,int passType,int beginAt) {
		
		if(passType <  days.length) {
			calculate(days,passType,beginAt+passType);
			calculate(days,passType,beginAt+passType);
			calculate(days,passType,beginAt+passType);
		}
		
		
		
		return 0;
	}

}
