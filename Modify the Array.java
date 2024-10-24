//Modify the Array

//Given an array arr. Return the modified array in such a way that if the current and next numbers are valid numbers and are equal then double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0's are shifted to the end.

//Note:

//Assume ‘0’ as the invalid number and all others as a valid number.
//The sequence of the valid numbers is present in the same order.

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length; 
        int zeroCnt = 0;
        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1] && arr[i] != 0){
                arr[i] = 2 * arr[i];
                list.add(arr[i]);
                arr[i+1] = 0;
            }else{
                if(arr[i] != 0){
                    list.add(arr[i]);
                }else{
                zeroCnt++;
                }
            }
        }
        if(arr[n-1] != 0){
            list.add(arr[n-1]);
        }
        while(zeroCnt > 0){
            list.add(0);
            zeroCnt--;
        }
        return list;

    }
}
