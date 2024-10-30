//Given an array arr[] of positive integers. Find the number of pairs of integers whose difference equals a given number k.
//Note: (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered different.

class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : arr){
            if(map.containsKey(num - k)){
                res += map.get(num - k);
            }
            if(map.containsKey(num + k)){
                 res += map.get(num + k);
            }
            
            map.put(num,map.getOrDefault(num , 0) + 1);
        }
        
        return res;
    }
}
