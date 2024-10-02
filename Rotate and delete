class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int k = 1;

        while (arr.size() > 1) {

            Collections.rotate(arr, 1);

            int deleteIdx = arr.size() - k;

            if (deleteIdx < 0) {
                deleteIdx = 0;
            }
            arr.remove(deleteIdx);

            k++;
        }

        return arr.get(0); 
    }
}
