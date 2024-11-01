//Given an array arr[ ] of positive elements. Consider the array as a circular array, meaning the element after the last element is the first element of the array. 
//The task is to find the maximum sum of the absolute differences between consecutive elements with shuffling of array elements allowed 
//i.e. shuffle the array elements and make [a1..an] such order that  |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1| is maximized.

class Solution {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        long[] reordered = new long[n];
        int left = 0;
        int right = n-1;
        for(int i=0; i<n; i++){
            reordered[i] = (i%2==0) ? arr[left++] : arr[right--];
        }
        
        long maxSum = 0;
        for(int i=0; i<n; i++){
            maxSum += Math.abs(reordered[i] - reordered[(i+1)%n]);
        }
        
        return maxSum;
    }
}
