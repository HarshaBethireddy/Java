package HashTables.Strings;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
// Space Complexity: O(n)

public class FirstNonRepeating {

    static char firstNonRepeatingChar(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for(char c : s.toCharArray()){
            if(freq.get(c) == 1)
                return c;
        } 
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss"));  // Output: 'w'
    }
}
