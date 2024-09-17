class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n==1){
            return 0;
        }
        Arrays.sort(arr);
        
        int diff = arr[n-1]-arr[0];
        int smallest, largest;
        
        for (int i=0; i<n-1; i++) {
            smallest = Math.min(arr[0]+k, arr[i+1]-k);
            largest = Math.max(arr[n-1]-k, arr[i]+k);
            
            if (smallest>=0) {
                diff = Math.min(diff, largest-smallest);
            }
        }
        return diff;
    }
}
