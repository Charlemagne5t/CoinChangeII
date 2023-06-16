public class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            dp[i][amount] = 1;
        }
        for (int i = coins.length - 1; i >= 0; i--) {
            for (int j = amount - 1; j >= 0; j--) {
                if (i == coins.length - 1) {
                    dp[i][j] = j + coins[i] > amount ? 0 : dp[i][j + coins[i]];
                } else {
                    dp[i][j] = (j + coins[i] > amount ? 0 : dp[i][j + coins[i]]) + dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}
