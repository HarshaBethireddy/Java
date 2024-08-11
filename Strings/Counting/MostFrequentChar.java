package Counting;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {

    // O(n), O(1)
    static char mostFrequentCharUsingCountArr(String s){
        int[] count = new int[256];
        char mostFreq = '\0';
        int maxCount = 0; 
        for(char c : s.toCharArray()){
            count[c]++;
            if (count[c] > maxCount) {
                mostFreq = c;
                maxCount = count[c];
            }
        }
        return mostFreq;
    }

    // O(n), O(n)
    static char mostFrequentCharUsingMap(String s){
        Map<Character, Integer> freq = new HashMap<>();
        int maxCount = 0;
        char mostFreq = '\0';
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() > maxCount){
                mostFreq = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFreq;
    }
    public static void main(String[] args) {
        String s = "abaac";
        System.out.println(mostFrequentCharUsingCountArr(s));
        System.out.println(mostFrequentCharUsingMap(s));
    }
}
