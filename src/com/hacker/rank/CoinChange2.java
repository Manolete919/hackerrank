package com.hacker.rank;
// https://www.youtube.com/watch?v=1R0_7HqNaW0
// https://www.youtube.com/watch?v=jgiZlGzXMBw
import java.util.Arrays;

public class CoinChange2 {
	
	public static int coinChange(int [] coins, int amount) {
		Arrays.sort(coins);
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		
		for(int i = 0; i <= amount; i++ ) {
			//monedas, una a una
			for(int j = 0; j < coins.length; j++) {
				if(coins[j] <= i ) {
					// the actual value, vs the minimum if we use de mone
					dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
				}else {
					// the coins that we can not use...
					break;
				}
			}
		}
		
		return dp[amount] > amount ? -1 : dp[amount];		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(coinChange(new int[]{1,2,5},11));
		
	}

}
