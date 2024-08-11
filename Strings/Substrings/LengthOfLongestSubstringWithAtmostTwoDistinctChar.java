package Substrings;

public class LengthOfLongestSubstringWithAtmostTwoDistinctChar {

    static int lengthOfLongestSubstringWithAtmostTwoDistinctChar(String s) {
        int[] charCount = new int[128]; // ASCII characters
        int counter = 0; // Number of distinct characters
        int start = 0, end = 0;
        int maxLength = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (charCount[endChar] == 0) {
                counter++; // Increment counter when a new distinct character is encountered
            }
            charCount[endChar]++;
            end++;

            // When there are more than two distinct characters, slide the start pointer
            while (counter > 2) {
                char startChar = s.charAt(start);
                charCount[startChar]--;
                if (charCount[startChar] == 0) {
                    counter--; // Decrement counter when a distinct character is removed
                }
                start++;
            }

            // Update the maximum length of substring found
            maxLength = Math.max(maxLength, end - start);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "eceba";
        System.out.println(lengthOfLongestSubstringWithAtmostTwoDistinctChar(str)); // Output: 3
    }
}
