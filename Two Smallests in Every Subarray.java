
class Solution {
    public int pairWithMaxSum(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            
            int currentSum = arr[i - 1] + arr[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}
