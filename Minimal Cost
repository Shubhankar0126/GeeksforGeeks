class Solution {
    public int minimizeCost(int k, int arr[]) {
         int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0; 
        
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(arr[i] - arr[i - j]));
            }
        }
        return dp[n - 1];
    }
}
