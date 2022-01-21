package com.hacker.rank;

public class TargetSum {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 9, 3, 8, 4, 5, 8 };
		
		int arr[] = { 3, 4, 5, 8, 8, 9};

		System.out.println(findTargetSumWays(arr, 13));

	}

	public static void calculate(int[] nums, int pos, int sum, int S) {
		//System.out.println("out sis " + pos);
		System.out.println("----pos " + pos + " s " + S + "SUM " + sum);
		
		if (pos == nums.length) {
			System.out.println("pos " + pos + " target " + S + " SUM " + sum);
			if (sum == S)
			{
				System.out.println("aumenta - pos " + pos);
				count++;	
			}
				
			return;
		}
		calculate(nums, pos + 1, sum + nums[pos], S);
		calculate(nums, pos + 1, sum - nums[pos], S);
	}

	public static int findTargetSumWays(int[] nums, int S) {
		calculate(nums, 0, 0, S);
		return count;
	}

	public static int findTargetSumWays2(int[] nums, int S) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println("suma " + sum );
			
		if (S < -sum || S > sum)
			return 0;
		int dp[][] = new int[nums.length + 1][sum * 2 + 1];
		dp[0][sum] = 1;
		for (int i = 1; i <= nums.length; i++) {
			for (int j = 0; j < sum * 2 + 1; j++) {
				if (j + nums[i - 1] < sum * 2 + 1)
					dp[i][j] = dp[i][j] + dp[i - 1][j + nums[i - 1]];
				if (j - nums[i - 1] >= 0)
					dp[i][j] = dp[i][j] + dp[i - 1][j - nums[i - 1]];
			}
		}
		return dp[nums.length][sum + S];
	}

}
