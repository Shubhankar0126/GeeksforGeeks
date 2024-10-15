//Given an unsorted array of integers arr[], and a target tar, determine the number of subarrays whose elements sum up to the target value.


class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int currentSum = 0;
        int count = 0;

        prefixSumCount.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (prefixSumCount.containsKey(currentSum - tar)) {
                count += prefixSumCount.get(currentSum - tar);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
