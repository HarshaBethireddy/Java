package Substrings;

public class LengthOfLongestSubstringWithAtmostKDistinctChar {

    static int lengthOfLongestSubstringWithAtmostKDistinctChar(String s, int k){
        int[] charCount = new int[128];
        int counter = 0;
        int start = 0, end = 0;
        int maxLength = 0;
        
        while(end < s.length()){
            char endChar = s.charAt(end);
            if(charCount[endChar] == 0)
                counter++;
            charCount[endChar]++;
            end++;
            
            while(counter > k){
                char startChar = s.charAt(start);
                charCount[startChar]--;
                if(charCount[startChar] == 0)
                    counter--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(lengthOfLongestSubstringWithAtmostKDistinctChar(s, 1));
    }
}
