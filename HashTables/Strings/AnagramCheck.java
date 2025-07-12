package HashTables.Strings;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
// Space Complexity: O(n)
public class AnagramCheck {

    static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s1.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for(char c : s2.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) - 1);
            if(freq.get(c) == 0)
                freq.remove(c);
        }
        return freq.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));  // Output: true
    }
}
