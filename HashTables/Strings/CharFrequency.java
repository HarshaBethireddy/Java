package HashTables.Strings;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
// Space Complexity: O(n)
public class CharFrequency {

    static Map<Character, Integer> charFrequency(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        return freq;
    }
    public static void main(String[] args) {
        System.out.println(charFrequency("apple"));
    }
}
