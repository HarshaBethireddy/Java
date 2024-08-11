package Substrings;

public class LengthOfLongestSubstringWithAtmostOneRepeatingChar {

    static int lengthOfLongestSubstringWithAtmostOneRepeatingChar(String s){
        int[] charCount = new int[128];
        int start = 0, end = 0;
        int counter = 0;
        int maxLength = 0;

        while(end < s.length()){
            char endChar = s.charAt(end);
            charCount[endChar]++;
            if(charCount[endChar] == 2)
                counter++;
            end++;

            while(counter > 1) {
                char startChar = s.charAt(start);
                charCount[startChar]--;
                if(charCount[startChar] == 1)
                    counter--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstringWithAtmostOneRepeatingChar(s));
    }
}
