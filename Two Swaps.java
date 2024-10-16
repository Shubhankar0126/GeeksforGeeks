//Given a permutation of some of the first natural numbers in an array arr[], determine if the array can be sorted in exactly two swaps. A swap can involve the same pair of indices twice.

//Return true if it is possible to sort the array with exactly two swaps, otherwise return false.

class Solution {

    public boolean checkSorted(List<Integer> arr) {
         int count = 0;
        int i = 0;
        int n = arr.size();

        while (i < n) {
            if (arr.get(i) == i + 1) {
                i++;
            } else {
                
                Collections.swap(arr, i, arr.get(i) - 1);
                count++;
            }

            if (count > 2) {
                return false;
            }
        }

        return count == 2 || count == 0;
    
    }
}
