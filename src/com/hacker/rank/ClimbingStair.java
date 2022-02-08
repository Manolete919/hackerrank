package com.hacker.rank;

public class ClimbingStair {

	public static void main(String[] args) {
		System.out.println(climbStairs(5));
		
		System.out.println("contador: " + climbStairs(1));
		System.out.println("contador: " + climbStairs(2));
		System.out.println("contador: " + climbStairs(3));
		System.out.println("contador: " + climbStairs(4));
		System.out.println("contador: " + climbStairs(5));
		System.out.println("contador: " + climbStairs(6));

	}
	
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
