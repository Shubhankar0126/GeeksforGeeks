class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        int n = arr.size();
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }
        
        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0 && arr.get(i) < n) {
                result.set(arr.get(i), arr.get(i));
            }
        }
        
        return result;
    }
}
