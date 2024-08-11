package Counting;
import java.util.HashMap;
import java.util.Map;

public class NoOfDistinctChar {

    static int noOfDistinctCharInAStringUsingCountArr(String s){
        int[] count = new int[126];
        int distinctCount = 0;
        for(char c : s.toCharArray()){
            if(count[c] == 0)
                distinctCount++;
            count[c]++;
        }
        return distinctCount;
    }

    static int noOfDistinctCharInAStringUsingMap(String s){
        Map<Character, Integer> freq = new HashMap<>();
        int distinctCount = 0;
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for(Character key : freq.keySet())
            distinctCount++;
        return distinctCount;
    }

    public static void main(String[] args) {
        String str = "aabccd";
        System.out.println(noOfDistinctCharInAStringUsingCountArr(str));
        System.out.println(noOfDistinctCharInAStringUsingMap(str));
    }
}
