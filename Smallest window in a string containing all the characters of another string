//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    public static String smallestWindow(String s, String p)
    {
        int n = s.length();
        int m = p.length();

        if (n < m) return "-1";

        int[] charCountP = new int[256];
        for (char c : p.toCharArray()) {
            charCountP[c]++;
        }
        for (char c : p.toCharArray()) {
            if (charCountP[c] > 0 && s.indexOf(c) == -1) {
                return "-1";
            }
        }

        int start = 0, minLength = Integer.MAX_VALUE, startIndex = -1;
        int[] charCountS = new int[256];
        int requiredUniqueChars = 0;
        int matchedUniqueChars = 0;

        for (int i = 0; i < 256; i++) {
            if (charCountP[i] > 0) requiredUniqueChars++;
        }

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            charCountS[currentChar]++;

            if (charCountP[currentChar] > 0 && charCountS[currentChar] == charCountP[currentChar]) {
                matchedUniqueChars++;
            }
            while (matchedUniqueChars == requiredUniqueChars) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    startIndex = start;
                }

                char leftChar = s.charAt(start);
                charCountS[leftChar]--;

                if (charCountP[leftChar] > 0 && charCountS[leftChar] < charCountP[leftChar]) {
                    matchedUniqueChars--;
                }

                start++;
            }
        }
        if (startIndex == -1) return "-1";
        return s.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "timetopractice";
        String p = "toc";
        System.out.println("Smallest window: " + sol.smallestWindow(s, p));

    }
}
