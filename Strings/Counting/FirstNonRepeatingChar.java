package Counting;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar{

    // O(n), O(1)
    static char firstNonRepeatingCharacterUsingCountArr(String s){
        int[] count = new int[126];
        for(char c : s.toCharArray())
            count[c]++;
        for(char c : s.toCharArray()){
            if(count[c] == 1)
                return c;
        }
        return '\0';
    }

    //O(n), O(n)
    static char firstNonRepeatingCharacterUsingMaps(String s){
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return '\0';
    }
    public static void main(String[] args) {
        String s = "swiss";

        System.out.println(firstNonRepeatingCharacterUsingCountArr(s));
        System.out.println(firstNonRepeatingCharacterUsingMaps(s));
    }
}