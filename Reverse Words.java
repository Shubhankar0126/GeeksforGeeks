class Solution {
    public String reverseWords(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (c == '.') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0); 
                }
            } else {
                word.append(c);
            }
        }
        
        if (word.length() > 0) {
            words.add(word.toString());
        }
        
        Collections.reverse(words);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i));
            if (i != words.size() - 1) {
                result.append(".");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "i.like.this.program.very.much";
        String output = sol.reverseWords(input);
        System.out.println(output);  
    }
}
