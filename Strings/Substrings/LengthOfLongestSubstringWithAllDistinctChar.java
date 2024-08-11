package Substrings;
public class LengthOfLongestSubstringWithAllDistinctChar {

    static int lengthOfLongestSubstringWithAllDistinctChar(String s){
        int[] charCount = new int[128];
        int start = 0, end = 0;
        int counter = 0;
        int maxLength = 0;

        while(end < s.length()){
            char endChar = s.charAt(end);
            charCount[endChar]++;
            end++;

            while(charCount[endChar] > 1){
                char startChar = s.charAt(start);
                charCount[startChar]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcdea";
        System.out.println(lengthOfLongestSubstringWithAllDistinctChar(s));
    }
}