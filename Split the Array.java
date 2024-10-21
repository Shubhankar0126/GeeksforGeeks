//Given an array arr[] of integers, the task is to count the number of ways to split given array elements into two non-empty subsets such that the XOR of elements of each group is equal. Each element should belong to exactly one subset.
//Note:

//The answer could be very large so print it by doing modulo with 109 + 7. 
//Subsets with the same elements but derived from different indices are different.

class Solution {

    public static int countgroup(int arr[]) {
        int xor = 0;
        int n = arr.length;
        int mod = 1000000007;
        for(int i = 0; i<n; i++){
            xor ^= arr[i];
        }
        if(xor != 0) return 0;
        return (int)(Math.pow(2, n-1) - 1)%mod;
    }
}
