//Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and 4
//the fourth element is the second smallest, and so on.

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(l<=r){
            ans.add(arr[r]);
            r--;
            if(l<=r)
            ans.add(arr[l]);
            l++;
        }
        return ans;
    }
}
