class Solution {
    public int countBuildings(int[] height) {
        int count = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < height.length; i++) {
            if (height[i] > maxHeight) {
                count++;
                maxHeight = height[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] heights = {7, 4, 8, 2, 9};  
        int result = sol.countBuildings(heights);
        System.out.println(result); 
    }
}
