//Given an array arr consisting of positive integers numbers, remove all duplicates numbers.

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                result.add(arr[i]);
            }
        }
        return result;
    }
}
